package com.wisely.height_spring4.ch2.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration//声明当前类是一个配置类
@ComponentScan("com.wisely.height_spring4.ch2.prepost")//自动扫描包下的所有使用@service,@Component,@Repository,@Controller的类，并注册为bean
public class PrePostConfig {
	@Bean(initMethod="init",destroyMethod="destory")
	public BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	public JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
	
}
