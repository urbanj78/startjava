package com.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public int getCurrentNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers(int lenght) {
        return Arrays.copyOf(numbers, lenght);
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public void resetNumbers() {
        Arrays.fill(numbers, 0, attempt, 0);
    }
}