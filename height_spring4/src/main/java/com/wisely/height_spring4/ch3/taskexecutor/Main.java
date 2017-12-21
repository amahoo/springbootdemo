package com.wisely.height_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService=context.getBean(AsyncTaskService.class);
		for(int i=0;i<10;i++){
			
			//结果显示：是并发执行而不是顺序执行
		asyncTaskService.executAsyncTask(i);
		asyncTaskService.executAsyncTaskPlus(i);
		}
		context.close();
	}
}
