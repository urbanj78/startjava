package com.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("мужской");
        wolfOne.setName("Клык");
        wolfOne.setAge(10);
        wolfOne.setColour("белый");
        wolfOne.setWeight(40.7);
        System.out.println("Пол " + wolfOne.getGender());
        System.out.println("Имя " + wolfOne.getName());
        System.out.println("Цвет " + wolfOne.getColour());
        System.out.println("Возраст " + wolfOne.getAge() + " лет");
        System.out.println("Вес " + wolfOne.getWeight() + " кг");
        wolfOne.sit();
        wolfOne.walk();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.yowl();
    }
}