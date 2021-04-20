public class JaegerTest {
    public static void main(String[] args) {
        Jaeger chernoAlpha = new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(85.34f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setStrenght(10);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setArmor(10);

        Jaeger coyoteTango = new Jaeger();
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(85.34f);
        coyoteTango.setWeight(2.312f);
        coyoteTango.setStrenght(7);
        coyoteTango.setSpeed(5);
        coyoteTango.setArmor(4);

        System.out.println("");
        System.out.println("Firts Jaeger " + chernoAlpha.getModelName());
        System.out.println("Mark " + chernoAlpha.getMark());
        System.out.println("Origin " + chernoAlpha.getOrigin());
        System.out.println("Height " + chernoAlpha.getHeight());
        System.out.println("Weight " + chernoAlpha.getWeight());
        System.out.println("Strenght " + chernoAlpha.getStrenght());
        System.out.println("Speed " + chernoAlpha.getSpeed());
        System.out.println("Armor " + chernoAlpha.getArmor());
        System.out.println("");
        System.out.println("Second Jaeger " + coyoteTango.getModelName());
        System.out.println("Mark " + coyoteTango.getMark());
        System.out.println("Origin " + coyoteTango.getOrigin());
        System.out.println("Height " + coyoteTango.getHeight());
        System.out.println("Weight " + coyoteTango.getWeight());
        System.out.println("Strenght " + coyoteTango.getStrenght());
        System.out.println("Speed " + coyoteTango.getSpeed());
        System.out.println("Armor " + coyoteTango.getArmor());

        System.out.println("");
        chernoAlpha.setWeight(chernoAlpha.getWeight() - (chernoAlpha.getWeight() - coyoteTango.getWeight()));
        System.out.println("Weight of the " + chernoAlpha.getModelName() + " after first maintenance " + chernoAlpha.getWeight() + " tons");
    }
}