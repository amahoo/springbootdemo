package com.wisely.height_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	@Override
	public void onApplicationEvent(DemoEvent event) {
		// TODO Auto-generated method stub
		String msg=event.getMsg();
		System.out.println("我(bean-demolistener)接收到bean_demopublisher发过来的信息："+msg);
	}
	

}
