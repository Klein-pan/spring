package com.springtest.service.impl;

import com.springtest.dao.UserDao;
import com.springtest.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    // 利用set实现
    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

   @Override
   public void getUser() {
       userDao.getUser();
  }
}