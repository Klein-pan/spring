package com.springtest.dao.impl;

import com.springtest.dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
   @Override
   public void getUser() {
       System.out.println("MySql获取用户数据");
  }
}