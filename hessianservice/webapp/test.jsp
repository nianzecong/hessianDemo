<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.caucho.hessian.client.HessianProxyFactory,com.yesway.hessian.demo.BasicAPI"%>
<%@ page language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		HessianProxyFactory factory = new HessianProxyFactory();
		String url = ("http://" + request.getServerName() + ":"
				+ request.getServerPort() + request.getContextPath() + "/hessian/helloService");
		out.println(url + "<br/>");
		BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);
		out.println("Hello: " + basic.hello() + "<br/>");
		
		out.println("Hello: " + basic.getUser().getUserName() + "<br/>");
		out.println("Hello: " + basic.getUser().getPassword() + "<br/>");
	%>
</body>
</html>