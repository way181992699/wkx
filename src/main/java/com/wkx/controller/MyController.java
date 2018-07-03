package com.wkx.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wkx.pojo.JSONResult;
import com.wkx.pojo.OneSelf;
import com.wkx.pojo.SysMy;
import com.wkx.service.MyService;

@RestController
@RequestMapping("/My")
public class MyController {
	
			@Autowired
			MyService myService;
			@Autowired
			private Sid sid;
	
			@RequestMapping("/save")
			public JSONResult save(SysMy m) throws Exception {
				String id = sid.nextShort();
				m.setId(id);
				m.setBirthday(new Date());
				myService.save(m);
		
				return JSONResult.ok();
			} 
			@RequestMapping("/update")
			public JSONResult update(SysMy m) throws Exception {
				String id = sid.nextShort();
				m.setId("180702C030T6N828");
				
				m.setBirthday(new Date());
				myService.update(m);
		
				return JSONResult.ok();
			} 
			@RequestMapping("/delete")
			public JSONResult delete(String id) throws Exception {
		
				
				myService.delete(id);
		
				return JSONResult.ok();
			} 
			@RequestMapping("/queryOne")
			public JSONResult queryOne(String id) throws Exception {
				
				
		
				return JSONResult.ok(myService.queryById(id));
			} 
			@RequestMapping("/queryAll")
			public JSONResult queryAll(SysMy m) throws Exception {
			
				Map<String,Object> map = new HashMap<>();
				map.put("data", myService.queryAll());
				map.put("count", myService.count(m));
				return JSONResult.ok(map);
			} 
			@RequestMapping("/queryList")
			public JSONResult queryList(SysMy m) throws Exception {
				
			
		
				return JSONResult.ok(myService.queryList(m));
			} 
			@RequestMapping("/queryPage")
			public JSONResult queryPage(SysMy m,Integer page ,Integer pageSize) throws Exception {
				
				if(page==null) {
				page=1;	
				}
				
				return JSONResult.ok(myService.queryPage(page, pageSize, m));
			} 
	
			
			
}
