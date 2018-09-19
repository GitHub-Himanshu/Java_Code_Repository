package com.web.classes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.classes.service.LoginValidator;

@Controller
public class BasicController {
	
	@Autowired
	private LoginValidator login;
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String loginMVC()
	{
		return "loginPage";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String welcomeMVC(@RequestParam String userName,@RequestParam String password,ModelMap model)
	{
		if(this.login.validator(userName, password))
		{
			model.put("name", userName);
			return "homeScreen";	
		}
		model.put("error", "Invalid combination");
		return "loginPage";
	}
}
