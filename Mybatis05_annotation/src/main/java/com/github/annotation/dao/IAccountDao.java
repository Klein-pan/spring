package com.github.annotation.dao;

import com.github.annotation.domiam.Account;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
* 
* <p>Title: IAccountDao</p>
* <p>Description: 账户的持久层接口</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public interface IAccountDao {
    /**
     * 查询所有账户，采用延迟加载的方式查询账户的所属用户
     *
     * @return
     */
    @Select("select * from account")
    @Results(id = "accountMap",
            value = {
                    @Result(id = true, column = "id", property = "id"),
                    @Result(column = "uid", property = "uid"),
                    @Result(column = "money", property = "money"),
                    @Result(column = "uid",
                            property = "user",
                            one = @One(select = "com.github.annotation.dao.IUserDao.findById",
                                    fetchType = FetchType.LAZY))
            })
    List<Account> findAll();

    /**
     * 根据用户 id 查询用户下的所有账户
     * @param userId
     * @return
     */
    @Select("select * from account where uid = #{uid} ")
    List<Account> findByUid(Integer userId);
}
