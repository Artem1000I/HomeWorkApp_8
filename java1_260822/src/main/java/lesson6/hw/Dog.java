package lesson6.hw;

public class Dog extends Animal {

    public Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }

    public Dog() {
        super(500, 10);
    }
}
