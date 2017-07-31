package com.moprivatest.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.moprivatest.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello " + text;
	}
}