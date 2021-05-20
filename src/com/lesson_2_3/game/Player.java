package com.lesson_2_3.game;

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

    public void setNumber(int number, int position) {
        this.numbers[position] = number;
    }

    public int getNumber(int position){
        return this.numbers[position];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void resetNumbers(int attempt) {
        Arrays.fill(this.numbers, 0, attempt, 0);
    }
}