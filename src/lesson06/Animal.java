package lesson06;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private static int count = 0;

    public Animal() {
        count++;
    }

    public Animal(String name, String color, int age) {
        this();
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public static int getCount() {
        return count;
    }

    public void printInfo() {
        System.out.println("Животное: " + name + ", цвет: " + color + ", возраст: " + age);
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }

    public abstract void run(int distance);
}
