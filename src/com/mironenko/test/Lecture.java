package com.mironenko.test;

import sun.security.acl.GroupImpl;
import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private Professor professor;
    private Group group;

    public Lecture(Professor professor) {
        this.professor = professor;
        this.professor.addLecture(this);
    }

    public void addGroup(Group group) {
        this.group = group;
    }

    public String pereklichka() {
        String result = "";
        for (Person h : group.getStudents()) {
            result += h.speech();
        }

        return result;
    }

    public String chooseCaptain() {
        if (group == null) {
            return "чтобы выбрать старосту, добавьте группу к лекции\n";
        }
        Person capitan = null;
        for (Person p : group.getStudents()) {
            if (capitan == null) {
                capitan = p;
            }

            int best = capitan.getCunning() + capitan.getIntelligence();
            int currentPerson = p.getCunning() + p.getIntelligence();
            if (currentPerson > best) {
                capitan = p; //выбираем лучшего по интелекту и хитрости
            }
        }

        group.addCaptain(capitan);
        return "после голосования выиграл: " + group.speech();
    }
}
