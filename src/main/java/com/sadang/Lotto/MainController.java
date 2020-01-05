package com.sadang.Lotto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/index")
	public String testMain(){
		 
		return "index";
	}
} 
