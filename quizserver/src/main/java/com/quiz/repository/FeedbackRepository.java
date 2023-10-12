package com.quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entities.feedback;

public interface FeedbackRepository extends JpaRepository<feedback,Long> {

}
