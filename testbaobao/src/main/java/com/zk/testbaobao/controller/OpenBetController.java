package com.zk.testbaobao.controller;

import com.zk.testbaobao.constant.ConstantEntityForCmd;
import com.zk.testbaobao.model.HttpResModel;
import com.zk.testbaobao.model.OpenbetModel;
import com.zk.testbaobao.model.ResultModel;
import com.zk.testbaobao.util.HttpUtil;
import com.zk.testbaobao.util.JsonUtil;
import com.zk.testbaobao.util.MD5;
import com.zk.testbaobao.util.SecurityUtil;
import org.apache.commons.httpclient.Header;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.net.ConnectException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/openbet")
public class OpenBetController extends AgentAction{
	private static final Logger log = LoggerFactory.getLogger(OpenBetController.class);
	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getDispatcher()
	 */
	@Override
	protected String getDispatcher(Model model) {
		return "openbet";
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return ConstantEntityForCmd.OPEN_BET_ACCOUNT_CMD;
	}

	@RequestMapping(value = "submit")
	@ResponseBody
	public String submit(OpenbetModel openbet, Model model, HttpSession session) {
		String pass = openbet.getAccPass();
		openbet.setAccPass(MD5.mD5Encode(pass));
		ResultModel result = new ResultModel();
		
		String outJson = JsonUtil.convertObjectToJson(openbet);
		String secretKey = getSecretKey(openbet.getAgentNo(),session);
		String url = getUrl();
		if (StringUtils.isBlank(openbet.getAgentNo())) {
			openbet.setAgentNo((String)session.getAttribute("agentNo"));
		}
		
		if(HttpUtil.check(outJson,secretKey,url) != 0){
			return "异常";
		}
		
		try {
			// 加密
			byte[] encrptOutJson = SecurityUtil.doEncrypt(outJson, secretKey);
			
			String token = session!=null&&session.getAttribute("token")!=null ? (String)session.getAttribute("token") : null;
			
			// 创建头信息
			List<Header> header = HttpUtil.createHeader(getCmd(), MD5.asHex(encrptOutJson), token, openbet.getAgentNo());
			
			// 请求
			HttpResModel res = HttpUtil.post(url, header, encrptOutJson);
			result.setHead(res.getHead());

			try {
				if (res.isDes()) {
					// 当h_status状态正常时才进行消息的解密
					String json = SecurityUtil.doDecrypt(res.getBody(), secretKey);
					result.setBody(json);
					Map<String,Object> data = JsonUtil.convertJsonToMap(json);
					Map<String, Object> member = (Map<String, Object>) data.get("member");
					session.setAttribute("accountNo", data.get("betting_no"));
					session.setAttribute("mobile", openbet.getMobile());
				}
			} catch (Exception e) {
				log.error("数据转换异常", e);
			}
		} catch(ConnectException e) {
			log.error("连接异常", e);
			return "无法连接Inceptor或Agent(" + e.getMessage() + ")";
		} catch(Exception e) {
			log.error("请求发生异常", e);
			return e.getMessage();
		}
		
		return JsonUtil.convertObjectToJson(result);
	}
	

}
