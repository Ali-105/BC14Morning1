package day21;

import day20.FillAndPrintIntArray;

public class NewForEach {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3};
       // forIMethode(arr);
        forEachMethode(arr);
    }

    private static void forEachMethode(int[] input) {
        for (int element : input) {
            System.out.println(element + " ");

        }
    }

    private static void forIMethode(int [] input) {
        for (int i = 0; i <input.length ; i++) {
            input[i] = input[i] + 1;
            input[i] += 1;
            input[i]++;

        }
        FillAndPrintIntArray.myPrintIntArray(input);
    }
}
