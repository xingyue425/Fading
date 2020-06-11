package com.zk.testbaobao.controller;

import com.zk.testbaobao.util.MsgUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/showmsg")
public class MsgController {

	private static final Logger log = LoggerFactory
			.getLogger(MsgController.class);
	
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String init(HttpServletRequest req, HttpServletResponse res) {
		return "simu/msg";
	}

	@RequestMapping(value = "submit", method = RequestMethod.POST)
	@ResponseBody
	public String submit() {
		String json = "";
		try{
			json = MsgUtil.getList();
		}catch(Exception e){
			log.error("",e);
		}
		return json;
	}
	
	@RequestMapping(value = "clear", method = RequestMethod.POST)
	@ResponseBody
	public String clear() {
		MsgUtil.clear();
		return "ok";
	}


}
