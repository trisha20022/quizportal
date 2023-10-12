package com.quiz.service;

import java.util.Set;

import com.quiz.entities.Quiz;

public interface QuizService {
	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz>getQuizzes();
	public Quiz getQuiz(Long quizId);
	public void deleteQuiz(Long quizId);

}
