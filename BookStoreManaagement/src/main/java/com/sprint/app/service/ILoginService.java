package com.sprint.app.service;

import com.sprint.app.entity.User;

public interface ILoginService {

	public User addUser(User user);
	public boolean removeUser(User user);
	public User validateUser(User user);
}
