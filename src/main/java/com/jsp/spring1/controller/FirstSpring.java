package com.jsp.spring1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpring {

	@RequestMapping("/first")
	public void print()
	{
		System.out.println("yes its my first spring");
	}
}
