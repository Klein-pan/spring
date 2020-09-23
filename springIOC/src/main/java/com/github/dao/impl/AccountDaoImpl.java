package com.github.dao.impl;

import com.github.dao.IAccountDao;

/**
* 账户的持久层实现类
* @author 黑马程序员
* @Company http://www.ithiema.com
* @Version 1.0
*/
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}