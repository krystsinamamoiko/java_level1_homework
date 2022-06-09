package lesson06;

public class Dog extends Animal {
    private static int dogCount = 0;
    final int RUN_LIMIT = 500;
    final int SWIM_LIMIT = 10;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        dogCount++;
    }

    public void printInfo() {
        System.out.println("Собака имя: " + getName() + " цвет: " + getColor() + ", возраст: " + getAge());
    }

    public void run(int distance) {
        System.out.print("Пес ");
        if (distance <= RUN_LIMIT) {
            System.out.println(getName() + " пробежал: " + distance + " метров");
        } else {
            System.out.println(getName() + " пробежал: " + RUN_LIMIT + " метров");
        }
    }

    public void swim(int distance) {
        if (distance <= SWIM_LIMIT) {
            System.out.println(getName() + " проплыл: " + distance + " метров");
        } else {
            System.out.println(getName() + " проплыл: " + SWIM_LIMIT + " метров");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}
