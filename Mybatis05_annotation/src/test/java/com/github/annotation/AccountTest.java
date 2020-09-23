package com.github.annotation;

import com.github.annotation.dao.IAccountDao;
import com.github.annotation.dao.IUserDao;
import com.github.annotation.domiam.Account;
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
* <p>Title: AccountTest</p>
* <p>Description: 账户的测试类</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class AccountTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IAccountDao accountDao;

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
        accountDao = session.getMapper(IAccountDao.class);
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

    @Test
    public void testFindAll() {
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
            System.out.println(account.getUser());

        }
    }
}