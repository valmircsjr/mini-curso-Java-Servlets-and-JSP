package com.in28minutes.login;

public class LoginService {

		public boolean isUserValid (String user, String password) {
			if (user.equals("valmir") && password.equals("vava")) {
				return true;
			}
			
			return false;
		}
}
