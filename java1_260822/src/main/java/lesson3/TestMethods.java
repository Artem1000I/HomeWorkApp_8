package lesson3;

import java.util.Arrays;

public class TestMethods {
    public static void main(String[] args) {
        multiplyAndPrint(3, 4);
        multiplyAndPrint(56.24, 43.55);
        multiplyAndPrint(11);
        multiplyAndPrint(11.34);
    }

    public static void multiplyAndPrint(int a, int b) {
        int multiply = a * b;
        System.out.printf("Произведение %d и %d равно %d(целые)%n", a, b, multiply);
    }

    public static void multiplyAndPrint(double a, double b) {
        double multiply = a * b;
        System.out.printf("Произведение %.2f и %.2f равно %.4f(дробные)%n", a, b, multiply);
    }

    private static void multiplyAndPrint(int a) {
        int multiply = a * a;
        System.out.printf("Квадрат числа %d равен %d%n", a, multiply);
    }

    private static void multiplyAndPrint(double a) {
        multiplyAndPrint(a, a);
    }


}
