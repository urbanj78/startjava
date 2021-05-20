package com.lesson_2_3_4.calculator;

public class Calculator {
    static int num1 = 0;
    static int num2 = 0;
    static char mathSign = '+';

    public int calculate(int num1, int num2, char mathSign) {
        this.num1 = num1;
        this.num2 = num2;
        this.mathSign = mathSign;
        switch(mathSign) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                case '^':
                    return (int)Math.pow(num1, num2);
                case '%':
                    return (int)Math.IEEEremainder(num1, num2);
        }
        return 0;
    }
}