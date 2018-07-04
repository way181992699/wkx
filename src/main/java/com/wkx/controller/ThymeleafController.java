package com.wkx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wkx")
public class ThymeleafController {
	@RequestMapping("/index")
	public String index(ModelMap map) {
		String name ="开心";
		map.addAttribute("name", name);
		return "thymeleaf/index";
	}
	
	@RequestMapping("/ajax")
	public String getAjax(ModelMap map) {
	
		return "thymeleaf/ajaxerror";
	}

	@RequestMapping("/a")
	public String aa(ModelMap map) {
		String name ="开心";
		map.addAttribute("name", name);
		return "Index";
	}
}
