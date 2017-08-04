package com.zs.bootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zs.bootmybatis.entity.User;
import com.zs.bootmybatis.mapper.UserMapper;
import com.zs.bootmybatis.service.IUserService;

/**
*/
@RestController
@RequestMapping({ "/home" })
public class UserController {

	@Autowired
	IUserService userService;

	@RequestMapping(value = "/user")
	@ResponseBody
	public String user() {
		User user = userService.findUserByName("李四");
		return user.getName() + "-----" + user.getAge();
	}
	@RequestMapping(value = "/haha")
	public String insertUser() {
		return "hahahah";
	}
	
}