package com.lesson_2_3.game;

import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.Random;

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
        boolean win = false;
        Random random = new Random();


        do {
            int attemptPl1 = 0;
            int attemptPl2 = 0;
            guessNumberOne.setPcNum(random.nextInt(101));
            System.out.println("Компьютер загадал число");
            do {
                System.out.println(playerOne.getName() + " Введите ваше число, попытка №" + (attemptPl1 + 1));
                playerOne.setNumber(Integer.parseInt(reader.readLine()), attemptPl1);
                win = GuessNumber.guess(playerOne, attemptPl1);
                attemptPl1++;
                GuessNumberTest.attemptCheck(playerOne, attemptPl1);
                if (!win) {
                    System.out.println(playerTwo.getName() + " Введите ваше число, попытка №" + (attemptPl2 + 1));
                    playerTwo.setNumber(Integer.parseInt(reader.readLine()), attemptPl2);
                    win = GuessNumber.guess(playerTwo, attemptPl2);
                    attemptPl2++;
                    GuessNumberTest.attemptCheck(playerTwo, attemptPl2);
                }
                if (attemptPl1 == 10 && attemptPl2 == 10) {
                    System.out.println("Компьютер выиграл!");
                    win = true;
                }
            } while (!win);

            GuessNumberTest.printResult(playerOne, attemptPl1);
            GuessNumberTest.printResult(playerTwo, attemptPl2);
            playerOne.resetNumbers(attemptPl1);
            playerTwo.resetNumbers(attemptPl2);

            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = reader.readLine();
            } while (!answer.equals("yes") && !answer.equals("no"));

        } while (answer.equals("yes"));
    }

    private static void attemptCheck(Player player, int attempt) {
        if (attempt == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private static void printResult(Player player, int attempt) {
        int[] numbers = Arrays.copyOf(player.getNumbers(), attempt);
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }
}