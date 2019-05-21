package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("test.controller")
public class TestController {
/*	
 	get���
	@RequestMapping(value="/test/param.action", method = RequestMethod.GET)
	public String processGetRequest() {
		System.out.println("GET��� Request");
		return "paramResult";
	}
	post���
	@RequestMapping(value="/test/param.action", method = RequestMethod.POST)
	public String processPostRequest() {		
		System.out.println("POST��� Request");
		return "paramResult";
	}
*/	

	@RequestMapping(value="/test/param.action", method = {RequestMethod.GET,RequestMethod.POST})
	public String processPostRequest(PersonDTO dto, String name, HttpServletRequest request) {		
		System.out.println("GET/POST��� Request");
		System.out.println(name);
		System.out.println(request.getParameter("email"));
		System.out.println(dto);//�ؽ��ڵ� ���
		System.out.println("dto.getName() : "+ dto.getName());
		System.out.println("dto.getEmail() : "+dto.getEmail());
		System.out.println("dto.getPhone() : "+dto.getPhone());
		return "paramResult";
	}
	
	@RequestMapping(value="/test/mav.action", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView mavRequest(PersonDTO dto) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("paramResult");// �� /paramResult.jsp
		mav.addObject("dto",dto); // ��. ���۵Ǵ� dto�� �������� �ɼ�����
		//������ ���εǴ� ��� �ϳ�������
		
		return mav;
	}
	
	@RequestMapping(value="/test/redirect.action", method= {RequestMethod.GET,RequestMethod.POST})
	public String mavRedirectRequest(PersonDTO dto) {
		//return "redirect:/";//form���� �ٽ� �̵�
		return "redirect:/hello.action";//Ư�� �������� �����̷�Ʈ
	}
	
}
