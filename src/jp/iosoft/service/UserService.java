package jp.iosoft.service;

import jp.iosoft.exception.MyException2;

public class UserService {

	public void login(String username, String password) {
		if (!"admin".equals(username) || !"admin".equals(password)) {
			throw new MyException2("login.error", username);
		}
	}

}
