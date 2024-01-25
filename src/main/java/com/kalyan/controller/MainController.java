package com.kalyan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import jakarta.annotation.PostConstruct;

@Controller
public class MainController {
	public static Logger logger = LoggerFactory.getLogger(MainController.class);

	@PostConstruct
	public void m() {
		logger.info("Hello Kalyan");

	}

}
