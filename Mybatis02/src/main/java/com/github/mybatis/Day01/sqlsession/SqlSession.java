package com.github.mybatis.Day01.sqlsession;

public interface SqlSession {
    /**
     * 用于创建代理对象
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    public <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 用于释放资源
     */
    public void close();
}
