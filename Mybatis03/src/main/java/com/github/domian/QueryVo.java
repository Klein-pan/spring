package com.github.domian;

import java.io.Serializable;

/**
* 
* <p>Title: QueryVo</p>
* <p>Description: 查询条件对象</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class QueryVo implements Serializable {
private User user;
public User getUser() {
return user; }
public void setUser(User user) {
this.user = user; } }