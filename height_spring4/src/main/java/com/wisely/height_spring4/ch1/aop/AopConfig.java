package com.wisely.height_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.wisely.height_spring4.ch1.aop")
//使用EnableAspectJAutoProxy注解开启spring对AspectJ代理的支持
@EnableAspectJAutoProxy
public class AopConfig {

}


