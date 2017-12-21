package com.wisely.height_spring4.ch1.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wisely.height_spring4.ch1.di.DiConfig;
import com.wisely.height_spring4.ch1.di.UseFunctionService;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  context=new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService=context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayUseHello("java config"));
		
		context.close();
	}
}
