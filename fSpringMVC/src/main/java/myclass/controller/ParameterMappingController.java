package myclass.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import myclass.model.MemberVO;

@Controller
public class ParameterMappingController {
	
	@RequestMapping("param.do")
	public String test(MemberVO vo) {
		System.out.println("d");
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getId());
		return "param";
	}
	
	@RequestMapping("paramForm.do")
	public String test2(MemberVO vo) {
		System.out.println("되낭");
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getId());
		return "paramForm";
	}

}
