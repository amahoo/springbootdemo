package com.wisely.height_spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
      BeanWayService beanWayService=context.getBean(BeanWayService.class);
      JSR250WayService jsr250WayService=context.getBean(JSR250WayService.class);
      context.close();
	}

}
