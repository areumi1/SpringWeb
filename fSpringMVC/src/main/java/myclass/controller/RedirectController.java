package myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("insert.do")
	public String insert() {
		// ****************************
		// return "select";  호출한 인자의 값을 가져오지 못한다.
		// 리다이렉팅 ( 호출한 인자의 값까지 모두 가져와 페이지 전환)
		return "redirect:select.do";
	}
	
	@RequestMapping("select.do")
	public void select(Model m) {
		m.addAttribute("info","디비에서 넘어온 값");
		
	}
}
