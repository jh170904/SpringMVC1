package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test.controller")
public class TestController {
/*	
 	get방식
	@RequestMapping(value="/test/param.action", method = RequestMethod.GET)
	public String processGetRequest() {
		System.out.println("GET방식 Request");
		return "paramResult";
	}
	post방식
	@RequestMapping(value="/test/param.action", method = RequestMethod.POST)
	public String processPostRequest() {		
		System.out.println("POST방식 Request");
		return "paramResult";
	}
*/	

	@RequestMapping(value="/test/param.action", method = {RequestMethod.GET,RequestMethod.POST})
	public String processPostRequest(PersonDTO dto, String name, HttpServletRequest request) {		
		System.out.println("GET/POST방식 Request");
		System.out.println(name);
		System.out.println(request.getParameter("email"));
		System.out.println(dto);//해쉬코드 출력
		System.out.println("dto.getName() : "+ dto.getName());
		System.out.println("dto.getEmail() : "+dto.getEmail());
		System.out.println("dto.getPhone() : "+dto.getPhone());
		return "paramResult";
	}
	
	@RequestMapping(value="/test/mav.action", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView mavRequest(PersonDTO dto) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("paramResult");// 뷰 /paramResult.jsp
		mav.addObject("dto",dto); // 모델. 전송되는 dto는 여러개가 될수있음
		//하지만 매핑되는 뷰는 하나여야함
		
		return mav;
	}
	
	@RequestMapping(value="/test/redirect.action", method= {RequestMethod.GET,RequestMethod.POST})
	public String mavRedirectRequest(PersonDTO dto) {
		//return "redirect:/";//form으로 다시 이동
		return "redirect:/hello.action";//특정 페이지로 리다이렉트
	}
	
}
