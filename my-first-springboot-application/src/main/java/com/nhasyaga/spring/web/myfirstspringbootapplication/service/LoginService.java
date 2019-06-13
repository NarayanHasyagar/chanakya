package com.nhasyaga.spring.web.myfirstspringbootapplication.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	
	public boolean validateUser(String userID,String password)
	{
		return userID.equals("Narayan")&& password.equals("Hasyagar");
	}

}
