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

        do {
            if(checkAttempt(playerOne)) {
                enterNumber(playerOne);
                if (guess(playerOne, secretNumber)) {
                    break;
                }
            }
            if(checkAttempt(playerTwo)) {
                enterNumber(playerTwo);
                if (guess(playerTwo, secretNumber)) {
                    break;
                }
            }
            if(playerOne.getAttempt() == 10 && playerTwo.getAttempt() == 10) {
                System.out.println("Компьютер выиграл!");
                break;
            }
        } while (true);

        printPlayerNumbers(playerOne);
        printPlayerNumbers(playerTwo);
        playerOne.resetNumbers();
        playerTwo.resetNumbers();
    }

    private void enterNumber(Player currentPlayer) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(currentPlayer.getName() + " Введите ваше число, попытка №" + (currentPlayer.getAttempt() + 1));
        currentPlayer.setNumber(Integer.parseInt(reader.readLine()));
    }

    private boolean guess(Player currentPlayer, int secretNumber) {
        int number = currentPlayer.getCurrentNumber();

        if(number != secretNumber) {
            String moreLess = (number > secretNumber) ? "больше" : "меньше";
            System.out.println("Данное число " + moreLess + " того, что загадал компьютер");
            return false;
        }
        System.out.println(currentPlayer.getName() + " Вы угадали число " + secretNumber + " c " + (currentPlayer.getAttempt() + 1) + " попытки!");
        return true;
    }

    private boolean checkAttempt(Player currentPlayer) {
        if (currentPlayer.getAttempt() == 10) {
            System.out.println("У игрока " + currentPlayer.getName() + " закончились попытки!");
            return false;
        } return true;
    }

    private void printPlayerNumbers(Player currentPlayer) {
        int[] numbers = currentPlayer.getNumbers();
        for(int number : numbers) {
            System.out.print( number + " ");
        }
        System.out.println("");
    }
}