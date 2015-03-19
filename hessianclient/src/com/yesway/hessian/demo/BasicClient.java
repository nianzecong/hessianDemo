package com.yesway.hessian.demo;

import com.caucho.hessian.client.HessianProxyFactory;

public class BasicClient {
	public static void main(String[] args) throws Exception {
		String url = "http://localhost:8080/hessianservice/hessian/helloService";
		HessianProxyFactory factory = new HessianProxyFactory();
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);
		System.out.println("Hello:" + basic.hello());
		System.out.println("Hello:" + basic.getUser().getUserName());
		System.out.println("Hello:" + basic.getUser().getPassword());
		basic.setGreeting("HelloGreeting");
		System.out.println("Hello:" + basic.hello());
	}
}