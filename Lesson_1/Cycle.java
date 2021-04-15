public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int b = 6;
        while(b >= -6) {
            System.out.println(b);
            b -= 2;
        }

        int c = 10;
        int sumOdd = 0;
        do {
            c++;
            if(c % 2 != 0) {
                sumOdd += c;
            }
        } while(c < 20);
        System.out.println(sumOdd);
    }
}