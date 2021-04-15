public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "мужской";
        wolfOne.name = "Клык";
        wolfOne.age = 10;
        wolfOne.colour = "белый";
        wolfOne.weight = 40.7;
        System.out.println("Пол " + wolfOne.gender);
        System.out.println("Имя " + wolfOne.name);
        System.out.println("Цвет " + wolfOne.colour);
        System.out.println("Возраст " + wolfOne.age + " лет");
        System.out.println("Вес " + wolfOne.weight + " кг");
         wolfOne.sit();
         wolfOne.walk();
         wolfOne.run();
         wolfOne.hunt();
         wolfOne.yowl();
    }
}