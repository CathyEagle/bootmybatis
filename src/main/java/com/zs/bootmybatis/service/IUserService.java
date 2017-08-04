package com.zs.bootmybatis.service;

import com.zs.bootmybatis.entity.User;

public interface IUserService {

	
	public User findUserByName(String name);
}
