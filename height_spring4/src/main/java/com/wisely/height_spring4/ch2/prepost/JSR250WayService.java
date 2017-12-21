package com.wisely.height_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	@PostConstruct//在构造函数执行完后执行
	private void init() {
		// TODO Auto-generated method stub
		System.out.println("jsr250-init-method");
	}

	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
   @PreDestroy//在bean销毁前执行
	private void destory() {
		// TODO Auto-generated method stub
		System.out.println("jsr250-destory-method");
	}
	
}
