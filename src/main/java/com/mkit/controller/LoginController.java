package com.mkit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping("welcome/{name}")
	public String msg(@PathVariable String name) {
		logger.info("In LoginController : msg : name =", name);
		String msg = "<marquee><center><b>"+name.toUpperCase() + ", Welcome To Mukesh IT ...</b></center></marquee>";
		return msg;
	}
}
