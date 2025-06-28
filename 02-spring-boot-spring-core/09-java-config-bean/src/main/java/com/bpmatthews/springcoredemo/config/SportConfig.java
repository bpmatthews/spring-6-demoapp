package com.bpmatthews.springcoredemo.config;

import com.bpmatthews.springcoredemo.common.Coach;
import com.bpmatthews.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
