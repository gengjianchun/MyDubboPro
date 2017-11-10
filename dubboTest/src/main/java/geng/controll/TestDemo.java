package geng.controll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import geng.service.UserService;

@Controller
@RequestMapping("/test")
public class TestDemo {

	@Autowired
	UserService userService;
	
	@RequestMapping("/demo")
	public String demo(){
		
		System.out.println(userService.test());
		return "abc";
	}
	
}
