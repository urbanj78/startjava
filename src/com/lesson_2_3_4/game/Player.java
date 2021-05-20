package com.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void resetNumbers(int index) {
        Arrays.fill(numbers, 0, index, 0);
    }
}