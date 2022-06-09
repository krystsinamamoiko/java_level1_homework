package lesson07;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }
    public void eat(Plate p) {
        System.out.println("Cat " + name + " with appetite " + appetite + " tries to eat");
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }
}
