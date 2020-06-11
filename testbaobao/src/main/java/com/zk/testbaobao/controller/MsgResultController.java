package com.zk.testbaobao.controller;

import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntity;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.MsgUtil;
import com.zk.testbaobao.util.SecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
@RequestMapping(value = "/msg")
public class MsgResultController {

	private static final Logger log = LoggerFactory
			.getLogger(MsgResultController.class);

	@RequestMapping(value = "call", method = RequestMethod.POST)
	@ResponseBody
	public String msgInit(HttpServletRequest req, HttpServletResponse res) {

		String cmd = req.getHeader("cmd");
		String msg_id = req.getHeader("msg_id");
		String time_stamp = req.getHeader("time_stamp");
		String md = req.getHeader("md");

		try {
			
//			Thread.sleep(30*1000);

			byte[] data = readBodyAsByte(req.getInputStream());

			String mdcheck = MD5.asHex(data);

			if (md.equals(MD5.mD5Encode(mdcheck))) {
				return "md-error!";
			}
			String json = SecurityUtil.doDecrypt(data,
					ResourceUtils.getString(ConstantEntity.POINT_KEY));
			
			MsgUtil.put("[" + cmd + ":" + json + "]");
			
//			String json = new String(data);

			log.info(String.format(
					"header:{cmd:%s,msg_id:%s,time_stamp:%s,md:%s} body:%s",
					new Object[] { cmd, msg_id, time_stamp, md, json }));
			
			
			res.setHeader("cmd", cmd);
			res.setHeader("h_result_code", "0");
			res.setHeader("h_msg", "");
			res.setHeader("msg_id", msg_id);
			

		} catch (Exception e) {
			e.printStackTrace();
			log.error("", e);
		}
		return "";
	}

	public byte[] readBodyAsByte(InputStream in) throws IOException {
		byte[] byteInJson = {};
		// buff包装 设置缓冲区大小512
		BufferedInputStream bis = new BufferedInputStream(in, 512);

		// buff包装 设置缓冲区大小512 buff包装 设置缓冲区大小512
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(outputStream, 512);

		byte buffer[] = new byte[512];
		int nLength = -1;

		while ((nLength = bis.read(buffer)) != -1) {
			bos.write(buffer, 0, nLength);
		}

		bos.flush();
		byteInJson = outputStream.toByteArray();
		bis.close();
		bos.close();
		return byteInJson;
	}

}
