package com.mironenko.test;

import java.util.Random;

public class Professor extends Person {

    private static final int MAX_CUNNING = 100;
    private static final int MIN_CUNNING = 50;
    private static Random random = new Random();
    private int numberOfSpeech = -1;
    private Lecture lecture;

    public Professor(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public int getIntelligence() {
        return 100;
    }

    @Override
    public int getCunning() {
        return random.nextInt(MAX_CUNNING - MIN_CUNNING + 1) + MIN_CUNNING;
    }

    public void addLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public String speech() {
        numberOfSpeech++;
        if (numberOfSpeech % 3 == 0) {
            return "Здравствуйте, я " + getName() + " " + getSurname() + " и я ваш профессор.\n";
        } else if (numberOfSpeech % 2 == 0) {
            if (lecture == null) {
                return "Я должен быть на лекции чтобы выбрать старосту\n";
            } else {
                return "Время выбирать старосту, " + lecture.chooseCaptain();
            }
        } else {
            if (lecture == null) {
                return "Я должен быть на лекции чтобы сделать перекличку\n";
            } else {
                return "Давайте сделаем перекличку: \n" + lecture.pereklichka();
            }
        }
    }
}
