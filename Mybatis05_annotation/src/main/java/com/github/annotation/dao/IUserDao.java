package com.github.annotation.dao;

import com.github.annotation.domiam.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
* 
* <p>Title: IUserDao</p>
* <p>Description: 用户的持久层接口</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public interface IUserDao {
    /**
     * 查询所有用户
     *
     * @return
     */
    @Select("select * from user")
    @Results(id = "userMap",
            value = {
                    @Result(id = true, column = "id", property = "userId"),
                    @Result(column = "username", property = "userName"),
                    @Result(column = "sex", property = "userSex"),
                    @Result(column = "address", property = "userAddress"),
                    @Result(column = "birthday", property = "userBirthday",
                            many =@Many(select = "com.github.annotation.dao.IAccountDao.findByUid",
                                    fetchType = FetchType.LAZY))
            })
    List<User> findAll();

    /**
     * 根据 id 查询一个用户
     *
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{uid} ")
    @ResultMap("userMap")
    User findById(Integer userId);

    /**
     * 保存操作
     *
     * @param user
     * @return
     */
    @Insert("insert into user(username,sex,birthday,address)values(#{username},#{sex},#{birthday},#{address})")
    @SelectKey(keyColumn = "id", keyProperty = "id", resultType = Integer.class, before =
            false, statement = {"select last_insert_id()"})
    int saveUser(User user);

    /**
     * 更新操作
     *
     * @param user
     * @return
     */
    @Update("update user set username=#{username}," +
            "address=#{address},sex=#{sex},birthday=#{birthday} where id =#{id} ")
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param userId
     * @return
     */
    @Delete("delete from user where id = #{uid} ")
    int deleteUser(Integer userId);

    /**
     * 查询使用聚合函数
     *
     * @return
     */
    @Select("select count(*) from user ")
    int findTotal();

    /**
     * 模糊查询
     *
     * @param name
     * @return
     */
    @Select("select * from user where username like #{username} ")
    List<User> findByName(String name);
}