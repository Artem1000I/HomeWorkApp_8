package lesson7.oop;

import java.util.Random;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        int catEatFoodCount = new Random().nextInt(4, 8);

        plate.decreaseFood(catEatFoodCount);
        System.out.printf("Котик %s съел %s корма%n", name, catEatFoodCount);
    }
}
