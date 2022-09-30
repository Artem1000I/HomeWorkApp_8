package lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
//        testConsoleInput();
        testRandom();
    }

    private static void testConsoleInput() {
        int a = getValueFromScanner();
        int b = getValueFromScanner();
        TestMethods.multiplyAndPrint(a, b);
    }

    private static int getValueFromScanner() {
        while (true) {
            System.out.print("Введите целое число: ");
            if (in.hasNextInt()) {
                return in.nextInt();
            }
            System.out.println(in.next() + " - не число!");
        }
    }

    private static void testRandom() {
        int[] data = new int[40];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(); //-2147кк -- +2147кк
            data[i] = random.nextInt(10); //0 -- 9
            data[i] = random.nextInt(8) + 3; //3 -- 10
            data[i] = random.nextInt(13) - 5; //-5 -- 7

            data[i] = random.nextInt(3, 11);  //3 -- 10
            data[i] = random.nextInt(-5, 8);  //-5 -- 7

            data[i] = (int)(Math.random() * 10); //0 -- 9
            data[i] = (int)(Math.random() * 8) + 3; //3 -- 10
            data[i] = (int)(Math.random() * 13) - 5; //-5 -- 7
        }

        System.out.println(Arrays.toString(data));
    }
}
