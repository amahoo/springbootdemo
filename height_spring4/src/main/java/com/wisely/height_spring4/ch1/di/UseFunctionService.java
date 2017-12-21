package com.wisely.height_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component, @Repository, @Service, @Controller
@Component
public class UseFunctionService {
	  
	@Autowired
	FunctionService functionService;
	
	   public String sayUseHello(String word){
	    	
	    	return functionService.sayHello(word);
	    	
	    }
}