package com.tarun.imageUpload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// Api for testing
	@GetMapping("/")
	public String home() {
		return "imageUpload app in Spring Boot.";
	}
}
