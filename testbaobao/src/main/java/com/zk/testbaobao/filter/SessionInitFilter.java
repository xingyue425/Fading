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
