package com.lesson_2_3_4.game;

import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;


public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private static int pcNum;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void setPcNum(int pcNum) {
        this.pcNum = pcNum;
    }

    public static void gaming(Player playerOne, Player playerTwo) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int attemptPl1 = 0;
        int attemptPl2 = 0;
        boolean win = false;

        do {
            System.out.println(playerOne.getName() + " Введите ваше число, попытка №" + (attemptPl1 + 1));
            playerOne.setNumber(Integer.parseInt(reader.readLine()), attemptPl1);
            win = GuessNumber.guess(playerOne, attemptPl1);
            attemptPl1++;
            GuessNumber.attemptCheck(playerOne, attemptPl1);
            if (!win) {
                System.out.println(playerTwo.getName() + " Введите ваше число, попытка №" + (attemptPl2 + 1));
                playerTwo.setNumber(Integer.parseInt(reader.readLine()), attemptPl2);
                win = GuessNumber.guess(playerTwo, attemptPl2);
                attemptPl2++;
                GuessNumber.attemptCheck(playerTwo, attemptPl2);
            }
            if (attemptPl1 == 10 && attemptPl2 == 10) {
                System.out.println("Компьютер выиграл!");
                win = true;
            }
        } while (!win);

        GuessNumber.printResult(playerOne, attemptPl1);
        GuessNumber.printResult(playerTwo, attemptPl2);
        playerOne.resetNumbers(attemptPl1);
        playerTwo.resetNumbers(attemptPl2);
    }

    public static boolean guess(Player currentPlayer, int attempt) {
        if (currentPlayer.getCurrentNumber(attempt) > pcNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (currentPlayer.getCurrentNumber(attempt) < pcNum) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(currentPlayer.getName() + " Вы угадали число " + pcNum + " c " + (attempt + 1) + " попытки!");
            return true;
        }
    }

    private static void attemptCheck(Player player, int attempt) {
        if (attempt == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private static void printResult(Player player, int attempt) {
        int[] numbers = player.getNumbers(attempt);
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }
}