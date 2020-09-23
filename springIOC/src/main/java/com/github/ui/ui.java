package com.github.ui;

import com.github.factory.BeanFactory;
import com.github.service.IAccountService;

public class ui {
    public static void main(String[] args) {
        IAccountService accountService = (IAccountService) BeanFactory.getBean("accountService");

            accountService.saveAccount();
    }

}
