package lesson07;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (food < n) {
            System.out.println("It is possible to eat only " + food + " of food");
            food = 0;
        } else {
            food -= n;
        }
    }

    public void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
