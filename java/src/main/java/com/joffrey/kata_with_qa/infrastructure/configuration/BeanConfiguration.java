package com.joffrey.kata_with_qa.infrastructure.configuration;

import com.joffrey.kata_with_qa.domain.FeedBackUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public FeedBackUseCase feedBackUseCase() {
        return new FeedBackUseCase();
    }

}
