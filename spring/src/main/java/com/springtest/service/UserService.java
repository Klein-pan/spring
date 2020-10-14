package com.springtest.service;

import com.springtest.dao.UserDao;

public interface UserService {
   public void setUserDao(UserDao userDao);
   public void getUser();
}