package com.niit.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//If you want to navigate to other page with out carrying the data.
	/*@RequestMapping("/")
	public String home(){
		
		return "Home";
	}*/
	
	//If you want navigate to other page with carrying the data.
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv= new ModelAndView("Home");
		mv.addObject("message","Thank you for visiting this url");
		return mv;
	}
	
	@RequestMapping("/Registration")
	public ModelAndView registration()
	{
		ModelAndView mv= new ModelAndView("Registration");
		mv.addObject("userClickRegisterHere","true");
		return mv;
	}
	
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		ModelAndView mv= new ModelAndView("Login");
		mv.addObject("userClickLoginHere","true");
		return mv;
		
	}
}
