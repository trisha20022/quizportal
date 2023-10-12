package com.quiz.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.Question;
import com.quiz.entities.Quiz;



public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);
	
}

