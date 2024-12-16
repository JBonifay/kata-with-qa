package com.joffrey.kata_with_qa.infrastructure.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FeedbackControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void post_feedback_endpoint() throws Exception {
        mockMvc.perform(post("/feedback").content("""
                    {
                        "productId": "P12345",
                        "userId": "U67890",
                        "rating": 5,
                        "comment": "This product is excellent!"
                    }
                """)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().string("Feedback submitted successfully"));
    }

}
