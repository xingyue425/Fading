/**
 * <br>项目名: promotion
 * <br>文件名: DispacherAction.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;


public class DispacherAction extends DefaultAction {

	/**
	 * 
	 * <br>描 述：页面跳转处理
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "init", method = RequestMethod.GET)
	public String init(Model model) {
		String dispacher = getDispatcher(model);
		if(dispacher.contains("/")) {
			return getPrefix() + dispacher;
		}
		
		return getPrefix() + "/" + dispacher;
	}

	/**
	 * 
	 * <br>描 述：跳转
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @param model
	 * @return String
	 */
	protected String getDispatcher(Model model) {
		return null;
	}
	
	/**
	 * 
	 * <br>描 述：跳转前缀
	 * <br>作 者：yufenghe 
	 * <br>历 史: (版本) 作者 时间 注释
	 * @return String
	 */
	protected String getPrefix() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getSecretKey(javax.servlet.http.HttpSession)
	 */
	@Override
	protected String getSecretKey(String agentNo, HttpSession session) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getUrl()
	 */
	@Override
	protected String getUrl() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getCmd()
	 */
	@Override
	protected String getCmd() {
		return null;
	}
}
