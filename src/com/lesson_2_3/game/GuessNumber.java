package com.lesson_2_3.game;

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

    public static boolean guess(Player currentPlayer) {
        if(currentPlayer.getNumber() > pcNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
                return false;
            } else if(currentPlayer.getNumber() < pcNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                return false;
            } else {
                System.out.println("Вы угадали " + currentPlayer.getName() + "! Число " + pcNum);
                return true;
            }
    }
}