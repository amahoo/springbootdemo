package com.wisely.height_spring4.ch1.javaconfig;

public class UseFunctionService {
	FunctionService functionService;

	// public FunctionService getFunctionService() {
	// return functionService;
	// }

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}

	public String sayUseHello(String word) {

		return functionService.sayHello(word);

	}
}
