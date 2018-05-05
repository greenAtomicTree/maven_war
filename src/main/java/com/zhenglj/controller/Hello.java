package com.zhenglj.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhenglj.service.UserService;

@Controller
public class Hello {
	@Autowired
	private UserService userService;
		@RequestMapping("/say.do")
		@ResponseBody
		public String SayHello(String name){
			userService.doQuery();
			return name+"hello";
		}
		
		@RequestMapping("/say2.do")
		@ResponseBody
		public Map SayHello2(String name){
			Map<String,Object> ret=new HashMap<String,Object>();
			ret.put("success", true);
			ret.put("msg", "ok");
			return ret;
		}
}
