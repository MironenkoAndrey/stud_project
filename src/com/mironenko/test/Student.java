package com.mironenko.test;

import java.util.Random;

public class Student extends Person implements ITalk {

    private static final int MAX_INTELLEGENCE = 50;
    private static final int MIN_INTELLEGENCE = 0;
    private static Random random = new Random();

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Student(String name, String surname) {
        super(name, surname, 0);
    }

    @Override
    public int getIntelligence() {
        return random.nextInt(MAX_INTELLEGENCE - MIN_INTELLEGENCE + 1) + MIN_INTELLEGENCE;
    }

    @Override
    public int getCunning() {
        return 100;
    }

    @Override
    public String speech() {
        return "Привет, меня зовут " + getName() + " моя фамилия " + getSurname() + ". \n";
    }
}
