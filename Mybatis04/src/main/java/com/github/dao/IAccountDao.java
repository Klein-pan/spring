package com.github.dao;

import com.github.domian.Account;
import com.github.domian.AccountUser;
import com.github.domian.User;

import java.util.List;

/**
* 
* <p>Title: IAccountDao</p>
* <p>Description: 账户的持久层接口</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public interface IAccountDao {
/**
* 查询所有账户，同时获取账户的所属用户名称以及它的地址信息
* @return
*/
List<Account> findAll();
}