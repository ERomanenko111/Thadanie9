package ru.stormsar;


import java.time.LocalTime;

public class StudentWithTimer implements Learner {
    private Learner learner;

    public StudentWithTimer(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        LocalTime currentTime = LocalTime.now();
        learner.learn();
        System.out.printf("Текущее время: %02d:%02d:%02d%n", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
    }
}