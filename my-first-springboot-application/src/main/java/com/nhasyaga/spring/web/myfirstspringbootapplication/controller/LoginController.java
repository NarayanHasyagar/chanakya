package com.nhasyaga.spring.web.myfirstspringbootapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nhasyaga.spring.web.myfirstspringbootapplication.service.LoginService;
@Controller
public class LoginController {

	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String SubmitData( ModelMap model, @RequestParam String name, @RequestParam String password)
		{
			boolean isValidate = service.validateUser(name,password);
			if(!isValidate)
			{
				model.put("errorMessage", "Invalid Username or password");
				return "login";
			}
			model.put("name",name);
			return "welcome";
		}
	
	@RequestMapping(value="/login",method= RequestMethod.GET)
public String LoginMessage( ModelMap model)	
	{
		//model.put("name",name);
		return "login";
	}
	

}
