package lesson07;

import java.util.Random;

public class HomeWorkAppLesson07 {
    private final static int CATS_NUMBER = 20; // number of cats in cats array
    private final static int UP_APPETITE_LIMIT = 30; // upper limit of cats appetite
    private final static int FOOD_IN_PLATE = 150; // initial food volume in the plate
    private final static int FOOD_TO_ADD = 60; // food volume that should be added

    public static void main(String[] args) {
        // generate array of cats
        Cat[] cats = createCats(CATS_NUMBER, UP_APPETITE_LIMIT);
        Plate plate = new Plate(FOOD_IN_PLATE);
        plate.info();

        // all cats from thr array try to eat
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            if (cats[i].isSatiety()) {
                System.out.println("Cat " + cats[i].getName() + " is satiety");
                System.out.println("------ Food left in the plate: " + plate.getFood());
            } else {
                System.out.println(cats[i].getName() + " is hungry");
            }
        }
        plate.info();

        // add food into the given plate
        plate.increaseFood(FOOD_TO_ADD);
        plate.info();
    }

    public static Cat[] createCats(int catsNumber, int upAppetiteLimit) {
        Cat[] cats = new Cat[catsNumber];
        Random rnd = new Random();
        for (int i = 0; i < catsNumber; i++) {
            int catAppetite = rnd.nextInt(upAppetiteLimit);
            cats[i] = new Cat("Cats_name_" + i, catAppetite);
        }
        return cats;
    }
}
