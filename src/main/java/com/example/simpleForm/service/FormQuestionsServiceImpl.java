package com.example.simpleForm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simpleForm.model.Questions;
import com.example.simpleForm.repository.QuestionsRepo;

@Service
public class FormQuestionsServiceImpl implements FormQuestionsService {

	@Autowired
	private QuestionsRepo questionsRepo;


	@Override
	public List<Questions> getAllDetails() {
		// TODO Auto-generated method stub
		return questionsRepo.findAll();
	}

	@Override
	public Optional<Questions> getDataById(int id) {
		// TODO Auto-generated method stub
		return questionsRepo.findById(id);
	}

	@Override
	public void saveNewData(Questions questions) {
		// TODO Auto-generated method stub
		questionsRepo.save(questions);
	}


}
