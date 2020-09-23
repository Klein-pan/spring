package com.github.service.impl;


import com.github.dao.IAccountDao;
import com.github.dao.impl.AccountDaoImpl;
import com.github.service.IAccountService;

import java.util.*;

/**
* 账户的业务层实现类
* @author 黑马程序员
* @Company http://www.ithiema.com
* @Version 1.0
*/
public class AccountServiceImpl implements IAccountService {
  // private IAccountDao accountDao = new AccountDaoImpl();//此处的依赖关系有待解决

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;
    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs; }
    public void setMyList(List<String> myList) {
        this.myList = myList; }
    public void setMySet(Set<String> mySet) {
        this.mySet = mySet; }
    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap; }
    public void setMyProps(Properties myProps) {
        this.myProps = myProps; }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySet);
        System.out.println(myMap);
        System.out.println(myProps);
    }
}


