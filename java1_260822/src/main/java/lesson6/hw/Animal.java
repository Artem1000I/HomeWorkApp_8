package lesson6.hw;

public class Animal {

    private int runLimit;
    private int swimLimit;
    private static int animalCount;

    public void swim(int n) {
        if (n < swimLimit) {
            System.out.println("Животное доплыло до конца!");
        } else {
            System.out.println("Не получилось...");
        }

    }

    public void run(int n) {
        if (n < runLimit) {
            System.out.println("Животное добежало!");
        } else {
            System.out.println("Не получилось...");
        }
    }

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }
}
