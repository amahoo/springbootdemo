package com.wisely.height_spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService awareService=context.getBean(AwareService.class);
		//输出结果
		awareService.outputResut();
		context.close();
	}

}
