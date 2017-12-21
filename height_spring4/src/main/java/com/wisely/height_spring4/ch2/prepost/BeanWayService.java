package com.wisely.height_spring4.ch2.prepost;

public class BeanWayService {
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("@Bean-init-method");
	}

	public BeanWayService() {
		super();
		System.out.println("初始化构造函数-BeanService");
	}

	private void destory() {
		// TODO Auto-generated method stub
		System.out.println("@Bean-destory-method");
	}

}
