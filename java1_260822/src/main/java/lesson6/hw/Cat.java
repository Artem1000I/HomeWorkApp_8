package lesson6.hw;

public class Cat extends Animal{
    private static int catCount;

    public Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
        catCount++;
    }

    public Cat() {
        this(200, 0);
    }

    @Override
    public void swim(int n) {
//        System.out.println("Коты не плавают!");
        throw new RuntimeException("Коты не плавают!");
    }
}
