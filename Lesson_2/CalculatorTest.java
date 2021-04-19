import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        Calculator calculatorOne = new Calculator();

        while(run) {

        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите знак математической операции:");
        char mathSign = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        int result = calculatorOne.computation(num1, num2, mathSign);

        System.out.println(num1 + " " + mathSign + " " + num2 + " = " + result);
        boolean ask = true;

            while(ask) {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                String answer = scanner.nextLine();

                if(answer.equals("no")) {
                    run = false;
                    break;
                } else if(answer.equals("yes")) {
                    ask = false;
                }
            }
        }
    }
}