package com.github.service.impl;


import com.github.dao.IAccountDao;
import com.github.factory.BeanFactory;
import com.github.service.IAccountService;

/**
* 账户的业务层实现类
* @author 黑马程序员
* @Company http://www.ithiema.com
* @Version 1.0
*/
public class AccountServiceImpl implements IAccountService {
    //private IAccountDao accountDao = new AccountDaoImpl();//此处的依赖关系有待解决

        private IAccountDao accountDao  = (IAccountDao) BeanFactory.getBean("accountDao");


        public void saveAccount() {
        int i = 1;
            accountDao.saveAccount();
            System.out.println(i);
            i++;
    }
}