public class Calculator {
        public int calculate(int num1, int num2, char mathSign) {
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
                    int result = num1;
                    for(int i = num2; i > 0; i--) {
                        result *= num1;
                    }
                    return result;
                case '%':
                    return num1 % num2;
                default :
                    break;
        }
        return 0;
    }
}