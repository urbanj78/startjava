package com.lesson_2_3_4.game;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class GuessNumberTest {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Игра Угадай Число");
        System.out.println("У каждого игрока 10 попыток");
        System.out.println("Введите имя первого игрока");
        Player playerOne = new Player(reader.readLine());
        System.out.println("Введите имя второго игрока");
        Player playerTwo = new Player(reader.readLine());
        GuessNumber guessNumberOne = new GuessNumber(playerOne, playerTwo);
        String answer = "yes";

        do {
            System.out.println("Компьютер загадал число");
            guessNumberOne.gaming(playerOne, playerTwo);

            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = reader.readLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}