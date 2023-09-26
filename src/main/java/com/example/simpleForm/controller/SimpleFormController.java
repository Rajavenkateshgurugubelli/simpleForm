package com.example.simpleForm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/form")
public class SimpleFormController {



	@GetMapping("/test-form")
	public String formCheck() {
		return "Form Getting Response";

	}

}
