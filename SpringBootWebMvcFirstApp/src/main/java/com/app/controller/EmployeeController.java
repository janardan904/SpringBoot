package com.app.controller;


import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@RequestMapping("/show")
	private String showPage(Model m) {
		m.addAttribute("msg","WELCOME App!!"+new Date());
		return "HOME";
	}

}
