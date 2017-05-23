package tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelfUserController {

	@RequestMapping(value="/test")
	public String createUser(){
		return "welcome";
	} 
}
