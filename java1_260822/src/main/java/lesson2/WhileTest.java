package lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class WhileTest {
    public static void main(String[] args) {

        int countApples = 20;
        while (countApples > 0) {
            countApples = getCountApplesAfterEat(countApples);

            System.out.println("Яблок стало меньше. Осталось " + countApples + " штук.");
        }

/*        for (;countApples > 0;) {
        }*/

        do {
            System.out.println("DO_WHILE");
        } while (countApples > 0);

    }

    private static int getCountApplesAfterEat(int countApples) {
        return countApples - (ThreadLocalRandom.current().nextInt(5) + 1);
    }
}
