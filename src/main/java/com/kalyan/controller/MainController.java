package com.kalyan.controller;

import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class MainController {

	@PostConstruct
	public void m() {
		System.out.println("MainController.m()");

	}

}
