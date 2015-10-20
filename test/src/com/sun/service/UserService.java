package com.sun.service;

import com.sun.beans.User1;
import com.sun.dao.UserDAO;

public class UserService {
	public User1 getUser(){
		return new UserDAO().getUser();
	}
}
