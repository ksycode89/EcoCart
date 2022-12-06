package com.cart.eco.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.cart.eco.common.service.EmpService;
import com.cart.eco.common.service.EmpVO;


/*
 * 로그인 완료 후에 추가작업
 */
public class CustomLoginSuccessHandler 
       implements AuthenticationSuccessHandler{
	
	
	@Autowired
	EmpService empSer;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
		Authentication authentication) throws IOException, ServletException {
		String name = authentication.getName();
		System.out.println(name);
//		System.out.println("CustomLoginSuccessHandler : " + name);
	
		EmpVO empVo= empSer.selectEmpOne(name);
		System.out.println("inner succhand : "+empVo);
		
		request.getSession().setAttribute("infos", empVo);
		request.getSession().setMaxInactiveInterval(3600);
		//사용자
		response.sendRedirect("/");
	}
}
