package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class ATeacher implements Teacher{
    List<Student> students = new ArrayList<>();

    @Override
    public void managerStudent(Student student) {
        students.add(student);
    }

    @Override
    public void notifyHomework() {
        for (Student student : students) {
            student.doHomework();
        }
    }
}
