package com.wisely.height_spring4.ch2.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.wisely.height_spring4.ch2.el")
// 注入配置文件需使用@PropertySource
@PropertySource("classpath:com/wisely/height_spring4/ch2/el/test.properties")
public class ElConfig {
	@Value("I Love You !") // 注入字符串
	private String normal;
	@Value("#{systemProperties['os.name']}") // 获取操作系统名
	private String osname;
	@Value("#{ T(java.lang.Math).random()*100.0}") // 注入表达式结果
	private double randomNumber;
	@Value("demoService.another") // 注入其他Bean的属性
	private String fromAnother;
	@Value("classpath:com/wisely/height_spring4/ch2/el/test.txt") // 注意这个Resource是:org.springframework.core.io.Resource;
	private Resource testfile;
	@Value("http://www.baidu.com") // 注入网址资源
	private Resource testUrl;
	@Value("${book.name}") // 注入配置文件
	private String bookName;
	@Autowired // 注入配置文件
	private Environment environment;

	@Bean // 注入配置文件
	public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	public void outputResource() {
		try {

			System.out.println("normal:" + normal);
			System.out.println("osName:" + osname);
			System.out.println("randomNumber:" + randomNumber);
			System.out.println("fromAnother:" + fromAnother);
			System.out.println("bookName:" + bookName);
			System.out.println("测试文件:" + IOUtils.toString(testfile.getInputStream()));
			System.out.println("配置文件book.author:" + environment.getProperty("book.author"));
			System.out.println("网址资源:" + IOUtils.toString(testUrl.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
