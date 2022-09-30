package lesson7.oop;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.printf("В миске осталось %s еды%n", foodCount);
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
        System.out.println("Объем миски уменьшился на " + catEatFoodCount);
    }
}
