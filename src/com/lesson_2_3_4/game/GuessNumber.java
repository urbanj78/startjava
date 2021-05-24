package com.lesson_2_3_4.game;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() throws Exception {
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean win = false;

        do {
            System.out.println(playerOne.getName() + " Введите ваше число, попытка №" + (playerOne.getAttempt() + 1));
            playerOne.setNumber(enterNumber(), playerOne.getAttempt());
            win = guess(playerOne, secretNumber);
            playerOne.setAttempt(playerOne.getAttempt() + 1);
            attemptCheck(playerOne);
            if (!win) {
                System.out.println(playerTwo.getName() + " Введите ваше число, попытка №" + (playerTwo.getAttempt() + 1));
                playerTwo.setNumber(enterNumber(), playerTwo.getAttempt());
                win = guess(playerTwo, secretNumber);
                playerTwo.setAttempt(playerTwo.getAttempt() + 1);
                attemptCheck(playerTwo);
            }
            if (playerOne.getAttempt() == 10 && playerTwo.getAttempt() == 10) {
                System.out.println("Компьютер выиграл!");
                win = true;
            }
        } while (!win);

        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.resetNumbers();
        playerTwo.resetNumbers();
    }

    private boolean guess(Player currentPlayer, int secretNumber) {
        int compareNumber = currentPlayer.getCurrentNumber((currentPlayer.getAttempt()));

        if(compareNumber != secretNumber) {
            String compareWord = (compareNumber > secretNumber) ? "больше" : "меньше";
            System.out.println("Данное число " + compareWord + " того, что загадал компьютер");
            return false;
        } else {
            System.out.println(currentPlayer.getName() + " Вы угадали число " + secretNumber + " c " + (currentPlayer.getAttempt() + 1) + " попытки!");
            return true;
        }
    }

    private void attemptCheck(Player currentPlayer) {
        if (currentPlayer.getAttempt() == 10) {
            System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки!");
        }
    }

    private void printPlayerNumbers(Player currentPlayer) {
        int[] numbers = currentPlayer.getNumbers(currentPlayer.getAttempt());
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }

    private int enterNumber() throws Exception {
        return Integer.parseInt(reader.readLine());
    }
}