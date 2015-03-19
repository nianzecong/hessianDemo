package com.yesway.hessian.demo;

import java.io.Serializable;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1502314994549275449L;
	String userName;
	String password;

	public User(String user, String pwd) {
		this.userName = user;
		this.password = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}
}