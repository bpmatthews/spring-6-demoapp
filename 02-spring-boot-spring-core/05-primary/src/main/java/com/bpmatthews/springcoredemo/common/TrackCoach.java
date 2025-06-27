package com.bpmatthews.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
@Primary
public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
