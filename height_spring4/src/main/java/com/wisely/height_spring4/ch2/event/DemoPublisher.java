package com.wisely.height_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class DemoPublisher {
	@Autowired                  //发布事件
   ApplicationContext applicationContext;
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));//publishEvent 用于发布
		
	}
}
