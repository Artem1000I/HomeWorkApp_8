package lesson7.string;

import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";
        String str3 = new String("Cat");
        String str4 = null;

        System.out.println("str1 == str2: " + str1.equals(str2));
        System.out.println("str1 == str3: " + str1.equals(str3));
        System.out.println("str4 == str3: " + Objects.equals(str3, str4));




        final int[] testArr = {1, 1, 1, 1, 1, 1};

//        testLinkArray(testArr);
//        testLinkArray(testArr.clone());

        int[] copyArr = new int[(int)(testArr.length * 1.5)];
        System.arraycopy(testArr, 0, copyArr, 0, testArr.length);
//        testLinkArray(copyArr);

        System.out.println(Arrays.toString(Arrays.copyOf(testArr, testArr.length)));

        System.out.println(Arrays.toString(testArr));
    }

    private static void testLinkArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
