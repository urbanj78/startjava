package com.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        String answer = "yes";

        while(answer.equals("yes")) {
            System.out.println("Введите первое число:");
            int num1 = scanner.nextInt();

            System.out.println("Введите знак математической операции:");
            char mathSign = scanner.next().charAt(0);

            System.out.println("Введите второе число:");
            int num2 = scanner.nextInt();
            scanner.nextLine();

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