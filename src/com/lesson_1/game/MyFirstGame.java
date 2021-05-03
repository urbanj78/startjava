package com.lesson_1.game;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyFirstGame {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        int pcNum = random.nextInt(101);

        System.out.println("Попробуй угадать число");
        TimeUnit.SECONDS.sleep(2);
        int myNum = 50;

        while(myNum != pcNum) {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(myNum);
            if(myNum > pcNum) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Данное число больше того, что загадал компьютер");
                myNum--;
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Данное число меньше того, что загадал компьютер");
                myNum++;
            }
        }
        System.out.println(myNum);
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Поздравляю, число угадано!");
    }
}