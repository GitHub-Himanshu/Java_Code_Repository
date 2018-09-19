package com.web.classes.service;

import org.springframework.stereotype.Service;

@Service
public class LoginValidator {
	
	public boolean validator(String userName, String password)
	{
		if(userName.equals("655036") && password.equals("Infosys"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
