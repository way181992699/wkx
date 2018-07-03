package com.wkx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
