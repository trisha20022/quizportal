package com.quiz.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.quiz.entities.feedback;
import com.quiz.repository.FeedbackRepository;

@Controller
public class feedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping("/feedback")
    public String showFeedbackForm(Model model) {
        model.addAttribute("feedback", new feedback());
        return "feedback-form";
    }

    @PostMapping("/feedback")
    public String submitFeedback(feedback feedback) {
        feedbackRepository.save(feedback);
        return "redirect:/thank-you";
    }
}

