package com.example.simpleForm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleForm.model.Questions;
import com.example.simpleForm.service.FormQuestionsService;



@RestController
@RequestMapping("/form")
public class SimpleFormController {

	@Autowired
	private FormQuestionsService formQuestionsService;


	public SimpleFormController(FormQuestionsService formQuestionsService) {
		super();
		this.formQuestionsService = formQuestionsService;
	}

	@GetMapping("/test-form")
	public String formCheck() {
		return "Form Getting Response";
	}

	@GetMapping("/get-all")
	public List<Questions> getAllData() {
		return formQuestionsService.getAllDetails();
	}

	@GetMapping("/get-data/{id}")
	public Optional<Questions> getDataById(@PathVariable("id") int id) {

		return formQuestionsService.getDataById(id);
	}

	@PostMapping("/add-data")
	public ResponseEntity<Questions> addFormData(@RequestBody Questions questions) {
		formQuestionsService.saveNewData(questions);
		return new ResponseEntity<>(questions, HttpStatus.OK);
	}
}
