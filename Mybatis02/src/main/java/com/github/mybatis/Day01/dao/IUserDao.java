package com.github.mybatis.Day01.dao;

import com.github.mybatis.Day01.annotations.Select;
import com.github.mybatis.Day01.domian.User;


import java.util.List;

/**
* <p>Title: IUserDao</p>
* <p>Description: 用户的持久层操作</p>
* <p>Company: http://www.itheima.com/ </p>
*/
    public interface IUserDao {
    /**
    * 查询所有用户
    * @return
    */
    @Select("select * from user")
    List<User> findAll();
    }
