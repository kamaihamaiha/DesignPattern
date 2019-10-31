package com.design.pattern.TemplateMethod;

public abstract class Human {

    void live(){
        eat();
        sleep();
        speak();
    }

   private void eat(){
        System.out.println("吃饭");
    }

   private void sleep(){
        System.out.println("睡觉");
    }

    abstract void speak();

}
