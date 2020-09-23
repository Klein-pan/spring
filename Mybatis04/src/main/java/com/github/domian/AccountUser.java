package com.github.domian;

import java.io.Serializable;

/**
* 
* <p>Title: AccountUser</p>
* <p>Description: 它是 account 的子类</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class AccountUser extends Account implements Serializable {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString()+"AccountUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}