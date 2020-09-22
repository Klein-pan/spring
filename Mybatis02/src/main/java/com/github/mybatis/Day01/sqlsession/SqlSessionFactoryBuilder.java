package com.github.mybatis.Day01.sqlsession;

import com.github.mybatis.Day01.cfg.Configuration;
import com.github.mybatis.Day01.sqlsession.defaults.DefaultSqlSessionFactory;
import com.github.mybatis.Day01.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据输入的字节流来构建一个SqlSessionFatory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(cfg);
    }
}
