package com.ssm.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ssm.pojo.TRole;
import com.ssm.pojo.TStudent;

public class CommonInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String requestUri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url = requestUri.substring(contextPath.length());
		if ("/tologin".equals(url)||"/login".equals(url)||"/rolequit".equals(url)||"/stuquit".equals(url)) {
			return true;
		} else {

			TRole role = (TRole) request.getSession().getAttribute("role");
			TStudent student = (TStudent) request.getSession().getAttribute("student");
			if (role == null && student == null) {
				request.getRequestDispatcher("/login.jsp").forward(request, response);
				return false;
			} else
				return true;
		}
	}
}
