package com.pavan.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestingController {
	
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome Killer";
	}
}
