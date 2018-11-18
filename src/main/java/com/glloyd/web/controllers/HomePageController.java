package com.glloyd.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController
{
	
	@RequestMapping("/index")
	public String getHomePage() {
		return "index";
	}

}
