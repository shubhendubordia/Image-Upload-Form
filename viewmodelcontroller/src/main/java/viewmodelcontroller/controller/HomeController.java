package viewmodelcontroller.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("name","Uttam");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(100);
		list.add(102);
		list.add(102);
		list.add(102);
		list.add(102);
		list.add(102);
		list.add(102);
		
		modelandview.addObject("marks",list);
		
		
		
		modelandview.setViewName("help");
		
		
		return modelandview;
		}
}
