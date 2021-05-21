package com.lesson_2_3_4.game;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Random;


public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    Random random = new Random();

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void gaming(Player playerOne, Player playerTwo) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int attemptPl1 = 0;
        int attemptPl2 = 0;
        int envisionedNum = (random.nextInt(101));
        boolean win = false;

        do {
            System.out.println(playerOne.getName() + " Введите ваше число, попытка №" + (attemptPl1 + 1));
            playerOne.setNumber(Integer.parseInt(reader.readLine()), attemptPl1);
            win = this.guess(playerOne, attemptPl1, envisionedNum);
            attemptPl1++;
            this.attemptCheck(playerOne, attemptPl1);
            if (!win) {
                System.out.println(playerTwo.getName() + " Введите ваше число, попытка №" + (attemptPl2 + 1));
                playerTwo.setNumber(Integer.parseInt(reader.readLine()), attemptPl2);
                win = this.guess(playerTwo, attemptPl2, envisionedNum);
                attemptPl2++;
                this.attemptCheck(playerTwo, attemptPl2);
            }
            if (attemptPl1 == 10 && attemptPl2 == 10) {
                System.out.println("Компьютер выиграл!");
                win = true;
            }
        } while (!win);

        this.printResult(playerOne, attemptPl1);
        this.printResult(playerTwo, attemptPl2);
        playerOne.resetNumbers(attemptPl1);
        playerTwo.resetNumbers(attemptPl2);
    }

    public boolean guess(Player currentPlayer, int attempt, int envisionedNum) {
        if (currentPlayer.getCurrentNumber(attempt) > envisionedNum) {
            System.out.println("Данное число больше того, что загадал компьютер");
            return false;
        } else if (currentPlayer.getCurrentNumber(attempt) < envisionedNum) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(currentPlayer.getName() + " Вы угадали число " + envisionedNum + " c " + (attempt + 1) + " попытки!");
            return true;
        }
    }

    private void attemptCheck(Player player, int attempt) {
        if (attempt == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
    }

    private void printResult(Player player, int attempt) {
        int[] numbers = player.getNumbers(attempt);
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }
}