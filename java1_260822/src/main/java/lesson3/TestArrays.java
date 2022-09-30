package lesson3;

import java.util.Arrays;

public class TestArrays {

    static final int ARRAY_SIZE = 7;

    public static void main(String[] args) {
        testOneArray();
        testTwoArray();
    }

    private static void testOneArray() {

        int[] data = new int[ARRAY_SIZE];

        data[0] = 5;
        data[3] = 11;
        data[data.length - 1] = 76;

/*        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data[4]);
        System.out.println(data[5]);
        System.out.println(data[6]);*/

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println(convertArrayToString(data));
    }

    private static String convertArrayToString(int[] data) {
        String str = "[";
        for (int i = 0; i < data.length; i++) {
            str += data[i];
            if (i != data.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }


    private static void testTwoArray() {
/*        int[][] data = new int[3][];
        data[0] = new int[4];
        data[1] = new int[5];
        data[1] = new int[1];*/

        int[][] data = new int[5][9];

        int n = 0;
        for (int i = 0; i < data.length; i++) {
//            System.out.println(Arrays.toString(data[i]));
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = n++;
            }
        }

/*        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%2d ", data[i][j]);
            }
            System.out.println();
        }*/

/*        for (int i = 0; i < data.length; i++) {
            int[] datum = data[i];
            for (int j = 0; j < datum.length; j++) {
                int num = datum[j];
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }*/

        //for-each, iter
        for (int[] datum : data) {
            for (int num : datum) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }


    }
}
