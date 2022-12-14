package myclass.controller;

/*
 *	뷰페이징 방식
 *
 * 1. ModelAndView에 지정
 * 		( setViewName() 이용 )
 * 
 * 2. String 리턴
 * 		리턴되는 문자열이 뷰페이지명
 * 3. void 리턴인 경우
 * 		요청명과 동일한 뷰페이지 지정
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import myclass.model.MemberVO;

	@Controller
	@RequestMapping("re")
	public class RequestMappingController {
	//@RequestMapping(value={"re/a.do","re/b.do"})
	
		@RequestMapping(value={"/a.do","/b.do"})
	public String test() {
		System.out.println("a.do 와 b.do 요청");
		return "home"; // String 이 리턴인 경우 뷰페이지 지정
	}
	
	@RequestMapping(value="/c.do")
	public void test2(String id) {
		System.out.println("c.do 요청" + id);
	}
	
	@RequestMapping(value="/request.do", method=RequestMethod.POST)
	public String test3(MemberVO vo) {
		System.out.println("request.do 요청");
		System.out.println(vo.getName());
		System.out.println(vo.getAge());
		System.out.println(vo.getId());
		return "multiInsert";
	}

	
}
 