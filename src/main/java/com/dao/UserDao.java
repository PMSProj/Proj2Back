package com.dao;

import com.model.User;

public interface UserDao {

	public void registerUser(User user);

	public boolean isEmailUnique(String email);
	public User login(User user);

	public void update(User validUser);
    User getUser(String email);
}
