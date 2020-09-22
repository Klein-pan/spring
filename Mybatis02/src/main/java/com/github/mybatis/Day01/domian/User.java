package com.github.mybatis.Day01.domian;

import java.io.Serializable;
import java.util.Date;

/**
* 
* <p>Title: User</p>
* <p>Description: 用户的实体类</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class User implements Serializable {
        private Integer id;
        private String username;
        private Date birthday;
        private String sex;
        private String address;

    public Integer getId() {
        return id; }
    public void setId(Integer id) {
        this.id = id; }
    public String getUsername() {
        return username; }
    public void setUsername(String username) {
        this.username = username; }
    public Date getBirthday() {
        return birthday; }
    public void setBirthday(Date birthday) {
        this.birthday = birthday; }
    public String getSex() {
        return sex; }
    public void setSex(String sex) {
        this.sex = sex; }
    public String getAddress() {
        return address; }
    public void setAddress(String address) {
        this.address = address; }
        @Override
        public String toString() {
        return "User [id=" + id + ", username=" + username + ", birthday=" + birthday
        + ", sex=" + sex + ", address="
        + address + "]"; } }