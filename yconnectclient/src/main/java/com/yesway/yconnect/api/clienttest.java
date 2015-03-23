package com.yesway.yconnect.api;

import com.caucho.hessian.client.HessianProxyFactory;
import com.yesway.yconnect.api.service.UserInfoService;


public class clienttest {
	public static void main(String[] args) throws Exception {
		String url = "http://localhost:8080/yconnectapi/api/userService";
		HessianProxyFactory factory = new HessianProxyFactory();
		UserInfoService userService = (UserInfoService) factory.create(UserInfoService.class, url);
		System.out.println("Hello:" + userService.getUser("00000001").getLoginName());
	}
}
