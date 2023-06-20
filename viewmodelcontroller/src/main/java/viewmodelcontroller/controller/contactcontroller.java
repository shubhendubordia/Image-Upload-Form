package viewmodelcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import viewmodelcontroller.model.User;
import viewmodelcontroller.service.UserService;

@Controller
public class contactcontroller {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataModel(Model m) {
		m.addAttribute("header", "hello shubhendu");
		m.addAttribute("desc", "This form is used for collecting your data");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		
		int createdUser = this.userService.createUser(user);
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		model.addAttribute("message","user created with id "+createdUser);
		return "success";
	}

}

//@RequestMapping(path = "/processform", method = RequestMethod.POST)
//public String handleForm(
//		@RequestParam("email") String userEmail,
//		@RequestParam("userName") String userName,
//		@RequestParam("passWord") String passWord, Model model) {
//	
//		model.addAttribute("name",userName);
//	model.addAttribute("email", userEmail);
//		model.addAttribute("password", passWord);
//		
//		User user = new User();
//		user.setEmail(userEmail);
//		user.setUserName(userName);
//		user.setPassWord(passWord);
//		
//		System.out.println(user);
//		
//		model.addAttribute("user", user);
//		
//		System.out.println("email :"+userEmail+" userName :"+userName+" PassWord :"+passWord);
//	return "success";
//}
