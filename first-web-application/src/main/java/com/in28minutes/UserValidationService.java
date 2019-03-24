package com.in28minutes;

public class UserValidationService {

		public boolean isUserValid (String user, String password) {
			if (user.equals("valmir") && password.equals("vava")) {
				return true;
			}
			
			return false;
		}
}
