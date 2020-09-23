package com.github.dao;


import com.github.domian.QueryVo;
import com.github.domian.User;


import java.util.List;

public interface IUserDao {
    /**
     * 根据用户信息，查询用户列表
     * @param user
     * @return
     */
    List<User> findByUser(User user);

    /**
     * 根据 id 集合查询用户
     * @param vo
     * @return
     */
    List<User> findInIds(QueryVo vo);

    /**
     * 查询所有用户，同时获取出每个用户下的所有账户信息
     * @return
     */
    List<User> findAll();
}

