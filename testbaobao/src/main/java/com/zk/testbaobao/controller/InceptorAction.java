/**
 * <br>项目名: promotion
 * <br>文件名: InceptorAction.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.controller;


import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntity;

import javax.servlet.http.HttpSession;

/** 
 * <br>类 名: InceptorAction 
 * <br>描 述: Inceptor请求
 * <br>作 者: yufenghe 
 * <br>创 建： 2016年4月28日 
 * <br>版 本：v1.0.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class InceptorAction extends DispacherAction {

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getSecretKey()
	 */
	@Override
	protected String getSecretKey(String agentNo, HttpSession session) {
		if(session != null) {
			String secretKey = (String)session.getAttribute("prokey");
			return secretKey;
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uuzz.lottery.promotion.web.DefaultAction#getUrl()
	 */
	@Override
	protected String getUrl() {
		String url = ResourceUtils.getString(ConstantEntity.INCEPTOR_BET_POST_URL);
		return url;
	}
	
	@Override
	protected String getPrefix() {
		return ConstantEntity.HTTP_INCEPTOR_PREFIX;
	}
}
