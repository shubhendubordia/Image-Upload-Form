package viewmodelcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {
	
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/enjoy";
	}
	
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is second handler");
		return "contact";
	}

}
