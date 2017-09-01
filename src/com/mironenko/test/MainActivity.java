package com.mironenko.test;

import java.util.ArrayList;

public class MainActivity {

    public static void main(String[] args) {
        Group group = new Group();
        ArrayList<Student> studsInMyGroup = getStudents();
        group.addAllStudent(studsInMyGroup);

        Professor professor = new Professor("Pavel", "Petrosovich", 64);
        System.out.print(professor.speech()); //профессор поздаровался
        System.out.print(professor.speech()); //профессор хочет сделать перекличку но он не на лекции нужно сделать lecture.addGroup(group);
        System.out.print(professor.speech()); //профессор хочетвыбрать старосту но он не на лекции нужно сделать lecture.addGroup(group);

        Lecture lecture = new Lecture(professor);
        lecture.addGroup(group);
        System.out.print(professor.speech());//профессор хочет поздароваться
        System.out.print(professor.speech());//профессор хочет выбрать старосту
        System.out.print(professor.speech());//профессор хочет сделать перекличку
    }

    private static ArrayList<Student> getStudents() {
        ArrayList<Student> result = new ArrayList<>();

        result.add(new Student("Диана", "Шинкаренко"));
        result.add(new Student("Владимир", "Нагорный"));
        result.add(new Student("Игорь", "Джевало"));
        result.add(new Student("Виталий", "Бондар"));
        result.add(new Student("Виктор", "Мизюра"));
        result.add(new Student("Диана", "Турек"));
        result.add(new Student("Владислав", "Телюк"));
        result.add(new Student("Максим", "Шаповал"));
        result.add(new Student("Андрей", "Пенкин"));
        result.add(new Student("Юрий", "Бурко"));
        result.add(new Student("Алексей", "Телегин"));
        result.add(new Student("Максим", "Мосуренко"));
        result.add(new Student("Дмитрий", "Гриценко"));
        result.add(new Student("Евгений", "Иванец"));
        result.add(new Student("Богдан", "Гумений"));
        result.add(new Student("Алексей", "Олейник"));
        result.add(new Student("Александр", "Жаворонков"));
        result.add(new Student("Денис", "Ткаченко"));
        result.add(new Student("Дарья", "Ткаченко"));
        result.add(new Student("Богдан", "Фазлиахмедов"));
        result.add(new Student("Яна", "Борисова"));
        result.add(new Student("Максим", "Вовк"));
        result.add(new Student("Дмитрий", "Войтов"));
        result.add(new Student("Ольга", "Ермолаева", 42));
        result.add(new Student("Анастасия", "Примаченко"));
        result.add(new Student("Ольга", "Кирилюк"));
        return result;
    }
}
