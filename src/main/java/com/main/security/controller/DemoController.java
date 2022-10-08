package com.main.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

	@GetMapping("/")
	public String getHome() {
		return "/WEB-INF/view/home.jsp";
	}
}