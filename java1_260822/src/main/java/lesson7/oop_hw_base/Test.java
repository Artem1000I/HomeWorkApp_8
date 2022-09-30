package lesson7.oop_hw_base;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мартин Лютер Кот");
        Cat cat2 = new Cat("Ричард");
        Cat cat3 = new Cat("Борис Николаевич");
        Plate plate = new Plate(0);

        plate.printInfo();

        Cat[] cats = {cat1, cat2, cat3};

        while (true) {
            plate.addFoodCount(10);
            for (Cat cat : cats) {
                cat.eat(plate);
                System.out.printf("%s поел и его сытость: %s%n", cat.getName(), cat.isSatiety());
            }
            plate.printInfo();
            Thread.sleep(3000);
        }

    }
}