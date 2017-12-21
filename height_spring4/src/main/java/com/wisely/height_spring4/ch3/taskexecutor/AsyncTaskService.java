package com.wisely.height_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async//标明这是一个异步方法  并将自动注入到ThreadPoolTaskExecutor作为taskExecutor
    public void executAsyncTask(Integer i) {
		System.out.println("执行异步任务:"+i);
	}
	
	@Async
    public void executAsyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1:"+(i+1));
	}
}
