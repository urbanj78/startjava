public class Player {
    private String name;
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Player(String name) {
        this.name = name;
        this.number = 0;
    }
}