package com.lesson_2_3_4.game;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void start() throws Exception {
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        boolean win = false;
        playerOne.setAttempt(0);
        playerTwo.setAttempt(0);

        do {
            if(!win) {
                enterNumber(playerOne);
                win = guess(playerOne, secretNumber);
            }
            if (!win) {
                enterNumber(playerTwo);
                win = guess(playerTwo, secretNumber);
            }
            if(playerOne.getAttempt() == 10 && playerTwo.getAttempt() == 10){
                System.out.println("Компьютер выиграл!");
                win = true;
            }
        } while (!win);

        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.resetNumbers();
        playerTwo.resetNumbers();
    }

    private void enterNumber(Player currentPlayer) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(currentPlayer.getName() + " Введите ваше число, попытка №" + (currentPlayer.getAttempt() + 1));
        currentPlayer.setNumber(Integer.parseInt(reader.readLine()), currentPlayer.getAttempt());
    }

    private boolean guess(Player currentPlayer, int secretNumber) {
        int number = currentPlayer.getCurrentNumber((currentPlayer.getAttempt()));

        if(number != secretNumber) {
            String moreLess = (number > secretNumber) ? "больше" : "меньше";
            System.out.println("Данное число " + moreLess + " того, что загадал компьютер");
            currentPlayer.setAttempt(currentPlayer.getAttempt() + 1);
            return false;
        } {
            System.out.println(currentPlayer.getName() + " Вы угадали число " + secretNumber + " c " + (currentPlayer.getAttempt() + 1) + " попытки!");
            currentPlayer.setAttempt(currentPlayer.getAttempt() + 1);
            return true;
        }
    }

    private boolean attemptCheck(Player currentPlayer) {
        if (currentPlayer.getAttempt() == 10) {
            System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки!");
            return false;
        } {
            return true;
        }
    }

    private void printPlayerNumbers(Player currentPlayer) {
        int[] numbers = currentPlayer.getNumbers();
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }
}