package com.gihub;

import com.github.dao.IAccountDao;
import com.github.domian.Account;
import com.github.domian.AccountUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/*
* <p>Title: MybastisCRUDTest</p>
* <p>Description: 一对多账户的操作</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class AccountTest {
    private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private IAccountDao accountDao;



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
        accountDao = session.getMapper(IAccountDao.class);
    }

    @After//在测试方法执行完成之后执行
    public void destroy() throws Exception {
        session.commit();
        //7.释放资源
        session.close();
        in.close();
    }
}