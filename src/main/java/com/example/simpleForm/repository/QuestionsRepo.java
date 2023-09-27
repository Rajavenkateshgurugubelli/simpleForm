package com.example.simpleForm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleForm.model.Questions;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {


	@Override
	List<Questions> findAll();

	Optional<Questions> findById(int id);
}
