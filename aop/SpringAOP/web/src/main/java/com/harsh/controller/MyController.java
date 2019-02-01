package com.harsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.harsh.service.MyService;

import data.User;

@Controller
public class MyController {
	
	@Autowired
	private MyService  service;
	
	@RequestMapping("/")
	public String showReg()
	{
		return "register";
	}
	
	@RequestMapping(value = "/reg",method=RequestMethod.POST)
	public String performReg(@ModelAttribute("user") User  user , Model model)
	{
		int i = service.showService(10);
		System.out.println("Controller id = " + i);
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/success")
	public String showReg1(@ModelAttribute("user") User  user , Model model)
	{
		System.out.println(user);
		model.addAttribute("user", user);
		return "redirect:/register";
	}
}
