package com.springtest.dao.impl;

import com.springtest.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
   @Override
   public void getUser() {
       System.out.println("Oracle获取用户数据");
  }
}