package com.day13.fanxing;
//含有泛型的接口
public interface MyGenericInterface<E>{
	public abstract void add(E e);
	
	public abstract E getE();  
}