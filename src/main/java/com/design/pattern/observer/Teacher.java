package com.design.pattern.observer;

public interface Teacher {

    /**
     * 管理学生
     * @param student
     */
    void managerStudent(Student student);


    /**
     * 通知家庭作业
     */
    void notifyHomework();
}
