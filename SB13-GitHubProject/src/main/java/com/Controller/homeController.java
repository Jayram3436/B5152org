package com.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homeController {

	@GetMapping("/")
	public void getMsg() {
		System.out.println("Hi");
		System.out.println("dev-2");
	}
}
