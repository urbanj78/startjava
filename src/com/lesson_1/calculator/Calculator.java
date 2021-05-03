package com.lesson_1.calculator;

import java.io.IOException;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите первое число");
        int firstNum = Integer.parseInt(reader.readLine());

        System.out.println("Введите математический знак");
        String mathSign = reader.readLine();

        System.out.println("Введите второе число");
        int secondNum = Integer.parseInt(reader.readLine());
        int result = 0;

        if(mathSign.equals("+")) {
            result = firstNum + secondNum;
        } else if(mathSign.equals("-")) {
            result = firstNum - secondNum;
        } else if(mathSign.equals("*")) {
            result = firstNum * secondNum;
        } else if(mathSign.equals("/")) {
            result = firstNum / secondNum;
        } else if (mathSign.equals("^")) {
            result = firstNum;
            for(int counter = secondNum; counter > 0; counter--) {
                result *= firstNum;
            }
        } else if (mathSign.equals("%")) {
            result = firstNum % secondNum;
        }
        System.out.println(firstNum + " " + mathSign + " " + secondNum + " = " + result);
    }
}