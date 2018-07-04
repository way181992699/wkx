package com.wkx.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wkx.pojo.JSONResult;
import com.wkx.pojo.OneSelf;

@RestController
@RequestMapping("/")
public class HelloController {
		
			@RequestMapping("/oneSelf")
			public JSONResult oneSelf(){
				OneSelf o =  new OneSelf();
				o.setAge(18);
				o.setName("July");
				o.setId(1);
				o.setPassword("123");
				o.setSex("男");
				
				return JSONResult.ok(o);
			}
			@RequestMapping("/hello")
			public JSONResult hello() {
				OneSelf o =  new OneSelf();
				o.setAge(18);
				o.setName("July");
				o.setId(1);
				o.setPassword("123");
				o.setSex("男");
				
				return JSONResult.ok(o);
			}
			
			
}
