package com.wkx.controller;

import com.wkx.pojo.SysMy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;


@Controller
@RequestMapping("ftl")
public class FreemarkerController {

	
	@RequestMapping("/index")
	public String index(ModelMap map) {
		SysMy s = new SysMy();
		s.setMyname("July");
		s.setId("2");
		s.setBirthday(new Date());
		map.addAttribute("data", s);
		return "freemarker/index";
	}
	@RequestMapping("/center")
	public String center(ModelMap map) {
		
		return "freemarker/center/center";
	}
}
