public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age > 20) {
            System.out.println("Старше 20-ти");
        }

        boolean maleGender = true;
        if (maleGender) {
            System.out.println("пол Мужской");
        }

        if (!maleGender) {
            System.out.println("пол Женский");
        }

        float height = 1.8f;
        if (height < 1.80) {
            System.out.println("Рост ниже 1.8 м");
        } else {
            System.out.println("Рост выше 1.8 м");
        }

        char firstLetterName = 'S';
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени - M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени - I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}