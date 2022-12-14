package lesson7.string;

import java.io.IOException;

public class StringMethods {

    public static void main(String[] args) throws IOException {
        String a1 = "Hello My ";
        String a2 = "Dear World";
        String a3 = a1 + a2;
//        a3 = a1.concat(a2).concat("!").concat(" (c)").concat("Safronov T.");

        String b1 = "Число";
        int b2 = 10;
        String b3 = b1 + b2;
        b3 = b1.concat(String.valueOf(b2));

        System.out.println(a1.equals(a2));
        System.out.println(a1.compareTo(a2));

        String spaces = "       \n\t\s     ";
        System.out.println(spaces.trim());
        System.out.println(spaces == null); //"" - false

        System.out.println(spaces.isEmpty()); //"" - true, "   " - false
        System.out.println(!(spaces.length() > 0)); //"" - true, "   " - false

        System.out.println(spaces.trim().isEmpty()); //"" - true, "   " - true
        System.out.println(spaces.isBlank()); //"" - true, "   " - true

        System.out.println(a3.substring(10));
        System.out.println(a3.substring(10, 15));
        System.out.println(a3.toLowerCase());
        System.out.println(a3.toUpperCase());
        //TODO Сделать в строке заглавной только первую букву

        System.out.println(a3.charAt(10));
        System.out.println(a3.indexOf('e', 2));

        for (String s : a3.split("\s+", 3)) {
            System.out.println("Строка: " + s);
        }

        System.out.println(a3.replaceAll("My", "Our"));
        System.out.println(a3.startsWith("/auth"));
        System.out.println(a3.endsWith(".txt"));

        System.out.println(String.join(", ", a1, a2, b1));
    }
}
