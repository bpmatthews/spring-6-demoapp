package com.bpmatthews.springcoredemo.common;

// not using @Component intentionally
public class SwimCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
