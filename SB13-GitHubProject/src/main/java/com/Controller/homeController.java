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
	
	@GetMapping("/1")
	public void getMsg2() {
		System.out.println("Hi2");
	}
	
	@GetMapping("/2")
	public void getMsg3() {
		System.out.println("Hi3");
	}
}
