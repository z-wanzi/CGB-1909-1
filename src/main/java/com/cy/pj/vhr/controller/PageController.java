package com.cy.pj.vhr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class PageController {
	@RequestMapping("doIndexUI")
	public String index() {
		return "index";
	}
	
	@RequestMapping("doSalar")
	public String salar() {
		return "salar";
	}
}
