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
import java.util.List;

/**
* 
* <p>Title: MybatisAnnotationCRUDTest</p>
* <p>Description: mybatis 的注解 crud 测试</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class UserTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;
    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        List<User> users = userDao.findAll();
         for(User user : users) {
         System.out.println("-----每个用户的内容-----");
         System.out.println(user);
         System.out.println(user.getAccounts());
         }
        }

        @Before//junit 的注解
        public void init ()throws Exception {
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
        public void destroy ()throws Exception {
            //提交事务
            session.commit();
            //释放资源
            session.close();
            //关闭流
            in.close();
        }
    }
