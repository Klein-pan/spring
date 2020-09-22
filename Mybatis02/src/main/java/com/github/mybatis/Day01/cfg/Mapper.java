package com.github.mybatis.Day01.cfg;

public class Mapper {
    private String queryString;//sql

    private String resultType;//全限定类名
    public String getQueryString() {
        return queryString;
    }

    public String getResultType() {
        return resultType;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
