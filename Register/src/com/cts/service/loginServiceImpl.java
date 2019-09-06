package com.cts.service;

import com.cts.bean.loginbean;
import com.cts.DAO.loginDAO;
import com.cts.DAO.loginDAOImpl;

public class loginServiceImpl implements loginService {


    loginDAO LoginDAO = new loginDAOImpl();
   
	@Override
	public boolean validateUser(loginbean bean) {
		return LoginDAO.validateUser(bean);
	}

}
