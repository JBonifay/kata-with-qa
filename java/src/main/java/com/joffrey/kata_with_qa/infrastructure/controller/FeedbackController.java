package com.joffrey.kata_with_qa.infrastructure.controller;

import com.joffrey.kata_with_qa.domain.FeedBackUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedbackController {

    private final FeedBackUseCase feedBackUseCase;

    public FeedbackController(FeedBackUseCase feedBackUseCase) {
        this.feedBackUseCase = feedBackUseCase;
    }

    @PostMapping("/feedback")
    public ResponseEntity<String> postFeedback() {
        return new ResponseEntity<>("Feedback submitted successfully", HttpStatus.CREATED);
    }

}
