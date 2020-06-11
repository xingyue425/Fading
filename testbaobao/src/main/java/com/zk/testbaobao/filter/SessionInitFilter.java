/**
 * <br>项目名: promotion
 * <br>文件名: SessionInitFilter.java
 * <br>Copyright 2016 北京壹平台科技有限公司
 */
package com.zk.testbaobao.filter;

import com.zk.testbaobao.config.ResourceUtils;
import com.zk.testbaobao.constant.ConstantEntity;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/** 
 * <br>类 名: SessionInitFilter 
 * <br>描 述: session初始化赋值 
 * <br>作 者: zhaowei 
 * <br>创 建： 2016年8月29日 
 * <br>版 本： v1.8.0 
 * <br>
 * <br>历 史: (版本) 作者 时间 注释
 */
public class SessionInitFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpRep = (HttpServletResponse) response;
		HttpSession session = httpReq.getSession();
		String agentNo= ResourceUtils.getString(ConstantEntity.AGENT_NO);
		session.setAttribute("agentNo", agentNo);
		String areaCode=ResourceUtils.getString(ConstantEntity.AREA_CODE);
		session.setAttribute("areaCode", areaCode);
		chain.doFilter(httpReq, httpRep);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
	@Override
	public void destroy() {
	}

}
