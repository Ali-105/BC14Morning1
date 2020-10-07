package day21;

import day20.FillAndPrintIntArray;

public class ClassWork {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 10, 4,};
        int[] noviiMasiv = arr;
        //FillAndPrintIntArray.myPrintIntArray(arr);
        //System.out.println(noviiMasiv);
        //System.out.println(arr);
        myPrint(arr);
    }

    private static void myPrint(int[] input) {
        for (int element : input){
            System.out.println(element);
        }
        for (int j : input) {
            System.out.println(" " + j);

        }
              {

        }


        for (int i = 0; i < input.length; i++) {
            System.out.print(" " + input[i]);

        }
    }
}
