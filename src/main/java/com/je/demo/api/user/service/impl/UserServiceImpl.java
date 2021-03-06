package com.je.demo.api.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.je.demo.api.user.dao.UserRepository;
import com.je.demo.api.user.entity.User;
import com.je.demo.api.user.service.UserService;


@Service
@Transactional
public class UserServiceImpl 
		implements UserService {
	
	@Autowired
	UserRepository userDao;

	@Override
	public User findOneByUsername(String username) {
		User u = userDao.findOderByUsername(username);
		return u;
	}

	@Override
	public void changePassword(String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
