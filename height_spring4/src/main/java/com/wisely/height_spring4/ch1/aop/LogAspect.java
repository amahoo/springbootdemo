package com.wisely.height_spring4.ch1.aop;




import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	@Pointcut("@annotation(com.wisely.height_spring4.ch1.aop.Action)")
	public void annotationPointCut(){};
	
	@After("annotationPointCut")
	public void after(JoinPoint joinPoint){
		//获取连接点的方法签名对象
		MethodSignature signature=(MethodSignature)joinPoint.getSignature();
		Method method=signature.getMethod();
		Action action=method.getAnnotation(Action.class);
		System.out.println("输出注解式拦截："+action.name());
		
	}
	
	@Before("execution(*com.wisely.height_spring4.ch1.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		//获取连接点的方法签名对象
		MethodSignature signature=(MethodSignature)joinPoint.getSignature();
		Method method=signature.getMethod();
		Action action=method.getAnnotation(Action.class);
		System.out.println("方法规则式拦截："+action.name());
		
	}
}
