package com.gihub;

import com.github.dao.IUserDao;
import com.github.domian.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
* 
* <p>Title: MybastisCRUDTest</p>
* <p>Description: 一对多的操作</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class UserTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IUserDao userDao;

    @Test
    public void testFindById() {
    //6.执行操作
        User user = userDao.findById(41);
        System.out.println("第一次查询的用户：" + user);
        User user2 = userDao.findById(41);
        System.out.println("第二次查询用户：" + user2);
        System.out.println(user == user2);
    }

    @Before//在测试方法执行之前执行
    public void init() throws Exception {
    //1.读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
    //2.创建构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    //3.创建 SqlSession 工厂对象
        factory = builder.build(in);
    //4.创建 SqlSession 对象
        session = factory.openSession();
    //5.创建 Dao 的代理对象
        userDao = session.getMapper(IUserDao.class);
    }

    @After//在测试方法执行完成之后执行
    public void destroy() throws Exception {
    //7.释放资源
        session.close();
        in.close();
    }
    /**
     * 测试一级缓存
     */
    @Test
    public void testFirstLevelCache(){
        SqlSession sqlSession1 = factory.openSession();
        IUserDao dao1 = sqlSession1.getMapper(IUserDao.class);
        User user1 = dao1.findById(41);
        System.out.println(user1);
        sqlSession1.close();//一级缓存消失
        SqlSession sqlSession2 = factory.openSession();
        //再次获取 SqlSession 对象
        // sqlSession = factory.openSession();
       // session.clearCache();//此方法也可以清空缓存
        IUserDao dao2 = sqlSession2.getMapper(IUserDao.class);
        User user2 = dao2.findById(41);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }
    /**
     * 测试缓存的同步
     */
    @Test
    public void testClearlCache(){
        //1.根据 id 查询用户
        User user1 = userDao.findById(41);
        System.out.println(user1);
        //2.更新用户信息
        user1.setUsername("update user clear cache");
        user1.setAddress("北京市海淀区");
        userDao.updateUser(user1);
        //3.再次查询 id 为 41 的用户
        User user2 = userDao.findById(41);
        System.out.println(user2);
        System.out.println(user1 == user2);
    }
}