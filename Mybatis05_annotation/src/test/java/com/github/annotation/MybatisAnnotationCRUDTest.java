package com.github.annotation;

import com.github.annotation.dao.IUserDao;
import com.github.annotation.domiam.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
* 
* <p>Title: MybatisAnnotationCRUDTest</p>
* <p>Description: mybatis 的注解 crud 测试</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class MybatisAnnotationCRUDTest {
    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    /**
     * 测试查询一个
     */
    @Test
    public void testFindById() {
        User user = userDao.findById(41);
        System.out.println(user);
    }

    /**
     * 测试保存
     */
    @Test
    public void testSave() {
        User user = new User();
        user.setUserName("mybatis annotation");
        user.setUserSex("男");
        user.setUserAddress("北京市顺义区");
        user.setUserBirthday(new Date());
        int res = userDao.saveUser(user);
        System.out.println("影响数据库记录的行数：" + res);
        System.out.println("插入的主键值：" + user.getUserId());
    }

    /**
     * 测试更新
     */
    @Test
    public void testUpdate() {
        User user = userDao.findById(63);
        user.setUserBirthday(new Date());
        user.setUserSex("女");
        int res = userDao.updateUser(user);
        System.out.println(res);
    }

    /**
     * 测试删除
     */
    @Test
    public void testDelete() {
        int res = userDao.deleteUser(63);
        System.out.println(res);
    }

    /**
     * 测试查询使用聚合函数
     */
    @Test
    public void testFindTotal() {
        int res = userDao.findTotal();
        System.out.println(res);
    }

    /**
     * 测试模糊查询
     */
    @Test
    public void testFindByName() {
        List<User> users = userDao.findByName("%m%");
        for (User user : users) {
            System.out.println(user);
        }
    }

    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;

    @Before//junit 的注解
    public void init() throws Exception {
//1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//2.创建工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(in);
//3.创建 session
        session = factory.openSession();
//4.创建代理对象
        userDao = session.getMapper(IUserDao.class);
    }

    @After//junit 的注解
    public void destroy() throws Exception {
//提交事务
        session.commit();
//释放资源
        session.close();
//关闭流
        in.close();
    }
}