package com.wisely.height_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskeSchedulerConfig.class);
		ScheduledTaskService scheduledTaskService=context.getBean(ScheduledTaskService.class);
		
	}
}
