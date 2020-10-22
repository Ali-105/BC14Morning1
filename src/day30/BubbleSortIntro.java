package day30;

import day20.FillAndPrintIntArray;

public class BubbleSortIntro {
    public static void main(String[] args) {
        int[] arr = new int[]{21, 45, 1, 38, 56, 75};

        /*bubbleSort(arr);
        FillAndPrintIntArray.myPrintIntArray(arr);*/
        bubbleSortRecursion(arr);
        FillAndPrintIntArray.myPrintIntArray(arr);

    }

    private static void bubbleSortRecursion(int[] arrUnsort) {
        int count = 0;
        for (int i = 0; i < arrUnsort.length - 1; i++) {
            if (arrUnsort[i] > arrUnsort[i + 1]) {
                int temp = arrUnsort[i];
                arrUnsort[i] = arrUnsort[i + 1];
                arrUnsort[i + 1] = temp;
                count++;
            }

        }
        if (count > 0) {
            bubbleSortRecursion(arrUnsort);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
}

