package training.servlets.service;

import training.servlets.beans.LoginBean;

public class UserBL {

	public boolean validateUser(LoginBean lb) {

		return (lb.getUserName().equals("india") && lb.getPassword().equals("sapient"));
	}
}
