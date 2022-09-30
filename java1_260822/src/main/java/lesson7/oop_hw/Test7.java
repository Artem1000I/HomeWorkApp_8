package lesson7.oop_hw;

import java.util.Random;

public class Test7 {

    public static final int PLATE_SIZE = 3;
    public static final Random random = new Random();
    private static final FoodObserver FOOD_OBSERVER = FoodObserver.getInstance();
    //Singleton

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < PLATE_SIZE; i++) {
            FOOD_OBSERVER.addPlate(new Plate());
        }

        FoodObserver foodObserver2 = FoodObserver.getInstance();
        FoodObserver foodObserver3 = FoodObserver.getInstance();
        FoodObserver foodObserver4 = FoodObserver.getInstance();

        Cat cat1 = new Cat("Мартин");
        Cat cat2 = new Cat("Шава");
        Cat cat3 = new Cat("Котик");
        Cat cat4 = new Cat("Борис Николаевич");
        Cat cat5 = new Cat("Мурзик");

        foodObserver2.addCat(cat1);
        foodObserver3.addCat(cat2);
        foodObserver2.addCat(cat3);
        foodObserver4.addCat(cat4);
        foodObserver2.addCat(cat5);
        cat5.eat();
        int foodCount;

        while (true) {
            System.out.println("Настал новый день! Пора кормить котов");
            foodCount = random.nextInt(16);
            System.out.printf("Добавлено %s еды%n", foodCount);
            FOOD_OBSERVER.addFood(foodCount);

            FOOD_OBSERVER.catsInfo();
            FOOD_OBSERVER.platesInfo();

            System.out.println();
            System.out.println("Наступила ночь");
            randomCatHungry();
            System.out.println("------\n");
            Thread.sleep(10000);
        }
    }

    private static void randomCatHungry() throws InterruptedException {
        for (Cat cat : FOOD_OBSERVER.cats) {
            cat.randomAppetite();
        }

    }
}
