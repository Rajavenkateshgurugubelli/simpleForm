package com.example.simpleForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.simpleForm.model.Questions;

@Repository
public interface QuestionsRepo extends JpaRepository<Questions, Integer> {


}
