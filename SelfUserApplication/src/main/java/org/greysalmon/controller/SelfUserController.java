package org.greysalmon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SelfUserController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String createUser(ModelMap model){
		model.addAttribute("message", "Welcome from spring mvc");
		return "welcome";
	} 
}
