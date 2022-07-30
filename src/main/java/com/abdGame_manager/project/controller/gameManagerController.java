package com.abdGame_manager.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class gameManagerController {
	// go
	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
}
