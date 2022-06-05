package lesson06;

import java.util.Random;

public class HomeWorkAppLesson06 {

    public static void main(String[] args) {
        Random ran = new Random();
        int dogNumber = ran.nextInt(1000);
        int catNumber = ran.nextInt(1000);

        createDogs(dogNumber);
        createCats(catNumber);

        System.out.println("Ожидаемое число собак = " + dogNumber + "; Число созданных собак = " + Dog.getDogCount());
        System.out.println("Ожидаемое число кошек = " + catNumber + "; Число созданных кошек = " + Cat.getCatCount());
        System.out.println("Число животных = " + Animal.getCount());
    }

    public static Dog[] createDogs(int dogsNumber) {
        Dog[] dogs = new Dog[dogsNumber];
        for (int i = 0; i < dogsNumber; i++) {
            dogs[i] = new Dog("Кличка " + i, "Цвет " + i, i);
        }
        return dogs;
    }

    public static Cat[] createCats(int catsNumber) {
        Cat[] cats = new Cat[catsNumber];
        for (int i = 0; i < catsNumber; i++) {
            cats[i] = new Cat("Кличка_" + i, "Цвет_" + i, i);
        }
        return cats;
    }
}
