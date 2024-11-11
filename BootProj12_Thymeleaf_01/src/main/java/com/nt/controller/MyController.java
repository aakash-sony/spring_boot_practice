package com.nt.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about",method = RequestMethod.GET)
	public String myMethod(Model model)
	{
		System.out.println("about method..");
		model.addAttribute("name","Akash");
		model.addAttribute("currentDate",new Date());
		return "about";
	}
}
