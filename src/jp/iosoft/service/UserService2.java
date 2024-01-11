package jp.iosoft.service;

import jp.iosoft.exception.LoginException;

public class UserService2 {

	public void login(String username, String password) {
		if (!"admin".equals(username) || !"admin".equals(password)) {
			throw new LoginException();
		}
	}

}
