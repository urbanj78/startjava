package com.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();
        String answer = "yes";

        while(answer.equals("yes")) {
            System.out.println("Введите математическое выражение:");
            String mathExp = scanner.nextLine();
            String[] spltdMathExp = mathExp.split(" ");
            int num1 = Integer.parseInt(spltdMathExp[0]);
            int num2 = Integer.parseInt(spltdMathExp[2]);
            char mathSign = spltdMathExp[1].charAt(0);

            System.out.println(num1 + " " + mathSign + " " + num2 + " = " + calculatorOne.calculate(num1, num2, mathSign));

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        }
    }
}