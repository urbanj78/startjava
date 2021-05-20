package com.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        String answer = "yes";

        while(answer.equals("yes")) {
            System.out.println("Введите математическое выражение");
            String mathExp = scanner.nextLine();
            String[] mathExpSymbols = mathExp.split(" ");
            int num1 = Integer.parseInt(mathExpSymbols[1]);
            char mathSign = mathExpSymbols[2].charAt(0);
            int num2 = Integer.parseInt(mathExpSymbols[3]);

            int result = calculatorOne.calculate(num1, num2, mathSign);

            System.out.println(num1 + " " + mathSign + " " + num2 + " = " + result);
            answer = "";

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}