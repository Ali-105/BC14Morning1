package day21;

import day20.FillAndPrintIntArray;

public class HM21 {
    public static void main(String[] args) {
        //Напишите метод печати для строкового массива (String[] germanCites)
        String[] germanCites = new String[]{"Berlin", "München", "Stuttgar", "Hamburg" } ;
        myPrintString(germanCites);

    }

    public static void myPrintString(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ,");

        }
    }
}
