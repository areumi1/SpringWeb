package myclass.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 *	모델(데이타)를 뷰페이지로 전송 
 * 
 * 1. ModelAndView  리턴 
 * 		- addObject()
 * 2. Model ( 호출함수의 인자에 선언만 하기 )
 * 		- setAttribute()
 */


@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@RequestMapping(value={"/modelandview.do"})
	public ModelAndView test() {
		// 1. ModelAndView 뷰페이지 지정
		ModelAndView mv = new ModelAndView();
		mv.setViewName("review/void");
		mv.addObject("greeting", "오늘행복");
		mv.addObject("test", "테스트임");
		return mv;
	}
	
	@RequestMapping(value={"/string.do"})
	// ******************* 
	// Model : 뷰단으로 데이타를 전송하는 객체
	// 			==> 인자에 지정
	public String test2(Model m) {
		// 2. 문자열 리턴 뷰페이지 지정
		m.addAttribute("greeting", "오늘행복");
		m.addAttribute("test", "테스트임");
		return "review/void";
	}
	
	@RequestMapping(value={"/void.do"})
	public void test3(Model m) {
		// 3. void 리턴 뷰페이지 지정
			// 	-> 요청명과 동일한 뷰페이지 지정
		m.addAttribute("greeting", "오늘행복");
		m.addAttribute("test", "테스트임");
	}

}
