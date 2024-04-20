package com.portfolio.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

	@GetMapping({"", "/"})
	public String home() {
		
		System.out.println("여기는 홈 컨트롤러");
		
		return "index";
	}
}
