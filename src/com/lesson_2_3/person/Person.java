package com.lesson_2_3.person;

public class Person {
    String name = "John";
    boolean maleGender = true;
    int age = 22;
    float weight = 78.5f;
    float height = 1.8f;

    void walk() {
        System.out.println("Прошёл один метр");
    }

    void run() {
        System.out.println("Пробежал один метр");
    }

    void sit() {
        System.out.println("Сидит");
    }

    String talk() {
        return "Hello";
    }

    void learnJava() {
        System.out.println("Изучает Java");
    }
}