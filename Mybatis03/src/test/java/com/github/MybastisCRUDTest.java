package com.github;

import com.github.dao.IUserDao;
import com.github.domian.QueryVo;
import com.github.domian.User;
import com.github.domian.User1;
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
* <p>Title: MybastisCRUDTest</p>
* <p>Description: 测试 mybatis 的 crud 操作</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class MybastisCRUDTest {
private InputStream in ;
private SqlSessionFactory factory;
private SqlSession session;
private IUserDao userDao;
    @Test
    public void testFindOne() {
            //6.执行操作
            User user = userDao.findById(41);
            System.out.println(user);
            }
        @Before//在测试方法执行之前执行
        public void init()throws Exception {
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
    @Test
    public void testSave(){
        User user = new User();
        user.setUsername("modify User property");
        user.setAddress("北京市顺义区");
        user.setSex("男");
        user.setBirthday(new Date());
        System.out.println("保存操作之前："+user);
        //5.执行保存方法
        userDao.saveUser(user);
        System.out.println("保存操作之后："+user);
    }
    @Test
    public void testUpdateUser()throws Exception{
        //1.根据 id 查询
        User user = userDao.findById(41);
        //2.更新操作
        user.setAddress("北京市顺义区");
        int res = userDao.updateUser(user);
        System.out.println(res);
    }
    @Test
    public void testDeleteUser() throws Exception {
    //6.执行操作
        int res = userDao.deleteUser(55);
        System.out.println(res);
    }

    @Test
    public void testFindByName(){
        //5.执行查询一个方法
        List<User> users = userDao.findByName("%王%");
        for(User user : users){
            System.out.println(user);
        }
    }

    @Test
    public void testFindTotal() throws Exception {
    //6.执行操作
        int res = userDao.findTotal();
        System.out.println(res);
    }
    @Test
    public void testFindByQueryVo() {
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        List<User> users = userDao.findByVo(vo);
        for(User u : users) {
            System.out.println(u);
        } }

    @Test
    public void testFindAll() {
        List<User1> user1s = userDao.findAll1();
        for(User1 user1 : user1s) {
            System.out.println(user1);
        } }
        @After//在测试方法执行完成之后执行
        public void destroy() throws Exception{
            session.commit();
            //7.释放资源
            session.close();
            in.close();
} }