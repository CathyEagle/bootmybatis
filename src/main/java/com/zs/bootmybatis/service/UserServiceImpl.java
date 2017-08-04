package com.zs.bootmybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zs.bootmybatis.entity.User;
import com.zs.bootmybatis.mapper.UserMapper;
@Transactional
@Service(value="userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User findUserByName(String name) {
		User user = userMapper.findUserByName("李四");
		return user;
	}
}
