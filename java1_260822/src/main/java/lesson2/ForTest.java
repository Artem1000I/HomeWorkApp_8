package lesson2;

public class ForTest {
    public static void main(String[] args) {
/*        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

/*        for (int i = 0; i > -1; i++) {
            System.out.println(i);
        }*/

        final int LIMIT_OF_CYCLE = 10;
/*        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            System.out.println("ВНЕШНИЙ ЦИКЛ i: " + i);
            for (int j = 0; j < LIMIT_OF_CYCLE; j++) {
                System.out.println("--- внутренний цикл j: " + j);
            }
        }*/

        String smilesStr = "";
        for (int i = 0; i < LIMIT_OF_CYCLE; i++) {
            if (i % 2 == 0) {
                smilesStr += "☺ ";
            } else {
                smilesStr += "☻ ";
            }
            System.out.printf("%s", smilesStr);

            for (int j = 0; j < LIMIT_OF_CYCLE - 1 - i; j++) {
                System.out.printf("%1s ", "○");
            }
            System.out.println();
        }

        for (int i = 0; i < 20; i++) {

            if (i == 16) {
                break;
            }

            if (i % 2 == 0) {
                continue;
            }

            System.out.print(" i:" + i);
        }
        System.out.println("\nEND");

    }

}
