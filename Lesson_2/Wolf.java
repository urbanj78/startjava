public class Wolf {
    private String gender = "мужской";
    private String name = "Волк";
    private String colour = "серый";
    private int age = 5;
    private double weight = 30.5;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
        this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void walk() {
        System.out.println("идёт");
    }

    public void run() {
        System.out.println("бежит");
    }

    public void sit() {
        System.out.println("сидит");
    }

    public void hunt() {
        System.out.println("охотится");
    }

    public void yowl() {
        System.out.println("воет");
    }
}