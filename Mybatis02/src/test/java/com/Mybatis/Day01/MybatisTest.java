package com.Mybatis.Day01;


import com.github.mybatis.Day01.dao.IUserDao;
import com.github.mybatis.Day01.domian.User;
import com.github.mybatis.Day01.is.Resources;
import com.github.mybatis.Day01.sqlsession.SqlSession;
import com.github.mybatis.Day01.sqlsession.SqlSessionFactory;
import com.github.mybatis.Day01.sqlsession.SqlSessionFactoryBuilder;


import java.io.InputStream;
import java.util.List;

/**
* 
* <p>Title: MybatisTest</p>
* <p>Description: 测试 mybatis 的环境</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class MybatisTest {
public static void main(String[] args)throws Exception {
    //1.读取配置文件
    InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
    //2.创建 SqlSessionFactory 的构建者对象
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    //3.使用构建者创建工厂对象 SqlSessionFactory
    SqlSessionFactory factory = builder.build(in);
    //4.使用 SqlSessionFactory 生产 SqlSession 对象
    SqlSession session = factory.openSession();
    //5.使用 SqlSession 创建 dao 接口的代理对象
    IUserDao userDao = session.getMapper(IUserDao.class);
    //6.使用代理对象执行查询所有方法
    List<User> users = userDao.findAll();
    for(User user : users) {
    System.out.println(user);
    }
    //7.释放资源
    session.close();
    in.close();
} }