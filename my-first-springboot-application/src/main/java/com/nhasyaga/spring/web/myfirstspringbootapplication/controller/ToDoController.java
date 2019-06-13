package com.nhasyaga.spring.web.myfirstspringbootapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhasyaga.spring.web.myfirstspringbootapplication.service.TodoService;;

@Controller
public class ToDoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value= "/todo",method = RequestMethod.GET)
	public String DisplayTodo()
	{
		
		return "todo";
	}

}
