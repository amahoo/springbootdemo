package com.wisely.height_spring4.ch3.aware;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.height_spring4.ch3.aware")//自动扫描包下的所有使用@service,@Component,@Repository,@Controller的类，并注册为bean
public class AwareConfig {

}
