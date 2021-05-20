package com.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 10, 3, 10);
        Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 85.34f, 2.312f, 7, 5, 4);

        System.out.println("");
        System.out.println("Firts Jaeger " + chernoAlpha.getModelName());
        System.out.println("Mark " + chernoAlpha.getMark());
        System.out.println("Origin " + chernoAlpha.getOrigin());
        System.out.println("Height " + chernoAlpha.getHeight());
        System.out.println("Weight " + chernoAlpha.getWeight());
        System.out.println("Strenght " + chernoAlpha.getStrenght());
        System.out.println("Speed " + chernoAlpha.getSpeed());
        System.out.println("Armor " + chernoAlpha.getArmor());
        System.out.println("");
        System.out.println("Second Jaeger " + coyoteTango.getModelName());
        System.out.println("Mark " + coyoteTango.getMark());
        System.out.println("Origin " + coyoteTango.getOrigin());
        System.out.println("Height " + coyoteTango.getHeight());
        System.out.println("Weight " + coyoteTango.getWeight());
        System.out.println("Strenght " + coyoteTango.getStrenght());
        System.out.println("Speed " + coyoteTango.getSpeed());
        System.out.println("Armor " + coyoteTango.getArmor());

        System.out.println("");
        chernoAlpha.setWeight(chernoAlpha.getWeight() - (chernoAlpha.getWeight() - coyoteTango.getWeight()));
        System.out.println("Weight of the " + chernoAlpha.getModelName() + " after first maintenance " + chernoAlpha.getWeight() + " tons");
    }
}