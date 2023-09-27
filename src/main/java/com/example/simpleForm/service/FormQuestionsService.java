package com.example.simpleForm.service;

import java.util.List;
import java.util.Optional;

import com.example.simpleForm.model.Questions;

public interface FormQuestionsService {


	public List<Questions> getAllDetails();

	Optional<Questions> getDataById(int id);

	public void saveNewData(Questions questions);

}
