package com.wisely.height_spring4.ch1.aop;

import org.springframework.stereotype.Service;
/**
 * 编写使用注解类式的截类
 * @author Administrator
 *
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解式拦截add操作")
	public void add(){};
}
