package com.lesson_2_3.game;

import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Игра Угадай Число");
        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(reader.readLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(reader.readLine());
        GuessNumber guessNumberOne = new GuessNumber(playerOne, playerTwo);
        String answer = "yes";
        boolean win = false;
        Random random = new Random();

        do {
            guessNumberOne.setPcNum(random.nextInt(101));
            System.out.println("Компьютер загадал число");
            do {
                System.out.println(playerOne.getName() + " Введите ваше число");
                playerOne.setNumber(Integer.parseInt(reader.readLine()));
                win = guessNumberOne.guess(playerOne);
                if(!win) {
                    System.out.println(playerTwo.getName() + " Введите ваше число");
                    playerTwo.setNumber(Integer.parseInt(reader.readLine()));
                    win = guessNumberOne.guess(playerTwo);
                }
            } while(!win);
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = reader.readLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}