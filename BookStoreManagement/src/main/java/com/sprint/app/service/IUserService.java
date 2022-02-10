package com.sprint.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sprint.app.entity.User;

@Service
public interface IUserService {
	
	public User getUser(int userId);
	public boolean removeUser(int userId);
	public List<User> getAllUsers();
	
}
