package com.quiz.service;

import java.util.Set;

import com.quiz.entities.Question;
import com.quiz.entities.Quiz;

public interface QuestionService {

	
	public Question addQuestion(Question question);
	
	public Question updateQuestion(Question question);
	
	public Set<Question> getQuestions();
	
	public Question getQuestion(Long questionId);
	
	public Set<Question> getQuestionsOfQuiz(Quiz quiz);
	
}
