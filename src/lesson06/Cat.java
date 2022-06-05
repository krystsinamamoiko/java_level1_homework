package lesson06;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int RUN_LIMIT = 200;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        catCount++;
    }

    public void printInfo() {
        System.out.println("Кот имя: " + getName() + " цвет: " + getColor()+ ", возраст: " + getAge()) ;
    }

    public void run(int distance) {
        System.out.print("Кот ");
        if (distance <= RUN_LIMIT) {
            System.out.println(getName() + " пробежал: " + distance + " метров");
        } else {
            System.out.println(getName() + " пробежал: " + RUN_LIMIT + " метров");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}
