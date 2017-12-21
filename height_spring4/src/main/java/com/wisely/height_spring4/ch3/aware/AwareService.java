package com.wisely.height_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{//获得bean名称和资源加载的服务

	
	private String beanName;
	private ResourceLoader  loader;
	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {//重写setResourceLoader方法
		this.loader=resourceLoader;
	}

	@Override
	public void setBeanName(String name) {//重写setBeanName方法
		this.beanName=name;
	}
	
	public  void outputResut(){
		System.out.println("Bean的名称为："+beanName);
		
		Resource resource=loader.getResource("classpath:com/wisely/height_spring4/ch3/aware/test.txt");//注意无空格
		
		try {
			System.out.println("ResourceLoader加载文件的内容是："+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
