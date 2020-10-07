package day21;

import day20.FillAndPrintIntArray;

public class Exercise {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        int[] x = creatyEvenArray(a, b);
        FillAndPrintIntArray.myPrintIntArray(x);
    }

    private static int[] creatyEvenArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                size++;
            }

        }
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                output[count] = i;
                count++;

            }

        }
        return output;


    }
}


