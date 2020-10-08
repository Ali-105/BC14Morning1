package day21;

import day20.FillAndPrintIntArray;

public class HM21 {
    public static void main(String[] args) {
        //Напишите метод печати для строкового массива (String[] germanCites)
        String[] germanCites = new String[]{"Berlin", "München", "Stuttgar", "Hamburg"};
        myPrintString(germanCites);


    }

    public static void myPrintString(String[] str) {
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";
        for (int i = 0; i < str.length; i++) {
            if (i % 2 == 0) {
                System.out.println(ANSI_RED + str[i] + " ," + ANSI_RESET);
            } else
                System.out.println(ANSI_GREEN + str[i] + " ," + ANSI_RESET);

        }
    }
}
