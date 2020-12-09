package com.design.pattern.observer;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）
 *
 * 一个老师管理多个学生，老师布置作业要通知学生。
 *
 * 参考：
 * 菜鸟教程: https://www.runoob.com/design-pattern/observer-pattern.html
 * B站: https://www.bilibili.com/video/BV1vg4y1v7V4?from=search&seid=16934035122373469207
 */
public class School {

    public static void main(String[] args) {

        //新建老师
        Teacher teacher = new ATeacher();

        //管理学生. 张三和李四
        teacher.managerStudent(new Zhangsan());
        teacher.managerStudent(new Lisi());

        //通知学生做作业
        teacher.notifyHomework();

    }
}
