package com.mironenko.test;

import java.util.ArrayList;
import java.util.List;

public class Group implements ITalk {

    private List<Person> students = new ArrayList<>();
    private Person captain;

    public void addCaptain(Person student) {
        this.captain = student;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addAllStudent(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Person> getStudents() {
        return students;
    }

    @Override
    public String speech() {
        return captain.speech();
    }
}