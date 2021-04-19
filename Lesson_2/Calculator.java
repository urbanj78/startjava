public class Calculator {
        public int computation(int num1, int num2, char mathSign) {
            switch(mathSign) {
                case 43:
                    return num1 + num2;
                case 45:
                    return num1 - num2;
                case 42:
                    return num1 * num2;
                case 47:
                    return num1 / num2;
                case 94:
                    int result = num1;

                    for(int counter = num2; counter > 0; counter--) {
                        result *= num1;
                    }
                    return result;
                case 37:
                    return num1 % num2;
                default :
                    break;
        }
        return 0;
    }
}