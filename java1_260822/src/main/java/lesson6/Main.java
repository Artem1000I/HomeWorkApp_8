package lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player("", 1, "");
        Wizard wizard = new Wizard("Александра", 1000);
        Knight knight = new Knight("Анатолий", 777, "Экскалибур");
        Player knight2 = new Knight("Владимир", 3000);

/*        wizard.printInfo();
        knight.printInfo();

        wizard.doAction();
        knight.doAction();*/

//        knight2.saddleHorse();

        Player[] players = {wizard, knight, knight2};

        for (Player player : players) {
            player.printInfo();
            player.doAction();

/*            if (player instanceof Knight) {
                Knight k = (Knight) player;
                k.saddleHorse();
            }*/
            if (player instanceof Knight k) {
                k.saddleHorse();
            }

            System.out.println();
        }

//        System.out.println(wizard.toString());


        Object[] objects = {
                new int[]{1,2,3},
                new Date(),
                new Scanner(System.in),
                Math.class,
                knight,
                "Hello, world"
        };

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
