package day28;

import day20.FillAndPrintIntArray;

public class ClassWorkDay28 {
    public static void main(String[] args) {
        /*int[] arr = new int[]{4, 5, 6};
        int[] arr1 = new int[]{1, 2};
        int[] arr2 = new int[]{3};
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr));// → [0, 0, 0, 0, 0, 6]
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr1));// → [0, 0, 0, 2]
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr2));// → [0, 3]*/

       /* int[] arr = new int[]{1,2,3};
        int[] arr1 = new int[]{4,5,6};
        int[] arr2 = new int[]{1,2,3,4};
        int [] arr3 = new int[]{5,6};
        FillAndPrintIntArray.myPrintIntArray(sumOne(arr,arr1));//  -> [1,2,3,4,5,6]
        FillAndPrintIntArray.myPrintIntArray(sumOne(arr2,arr3));// ->[1,2,3,4,5,6]*/

        /*int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{4, 5, 6};
        int[] arr3 = new int[]{1, 2, 3, 4};
        int[] arr4 = new int[]{5, 6};

        FillAndPrintIntArray.myPrintIntArray(sumTwo(arr1, arr2));//  -> [5,7,9]
        FillAndPrintIntArray.myPrintIntArray(sumTwo(arr3, arr4));//  -> [6,8,3,4]*/


       /* int[] arr = {1, 2, 3};
        int[] arr1 = {1, 3};
        int[] arr2 = {7, 2, 3};
        int[] arr3 = {1};
        int[] arr4 = {1, 2};
        int[] arr5 = new int[0];
        System.out.println(start1(arr, arr1));// → 2
        System.out.println(start1(arr2, arr3)); //→ 1
        System.out.println(start1(arr4, arr5));// → 1*/

        /*FillAndPrintIntArray.myPrintIntArray(fizzArray2(4));// → ["0", "1", "2", "3"]
        FillAndPrintIntArray.myPrintIntArray(fizzArray2(10));// → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        FillAndPrintIntArray.myPrintIntArray(fizzArray2(2));// → ["0", "1"]*/

        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{2, 3, 4};

        System.out.println(no14(arr)); //→true
        System.out.println(no14(arr1));// →false
        System.out.println(no14(arr2));// →true


    }

    private static boolean no14(int[] arr) {
        int countOne = 0;
        int countFour = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
                if (arr[i] == 4) {
                    countFour++;
                }
            }

        }
        return countOne == 0 || countFour == 0;
    }

    private static int[] fizzArray2(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = i;

        }
        return output;
    }


    private static int[] sumTwo(int[] array1, int[] array2) {
        int[] output = new int[array1.length];
        if (array1.length >= array2.length) ;
        for (int i = 0; i < array2.length; i++) {
            output[i] = array1[i] + array2[i];

        }
        for (int i = array2.length; i < array1.length; i++) {
            output[i] = array1[i];

        }
        return output;
    }

    private static int[] sumOne(int[] array1, int[] array2) {
        int[] output = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            output[i] = array1[i];


        }
        for (int i = 0; i < array2.length; i++) {
            output[array1.length + i] = array2[i];

        }
        return output;
    }

    private static int start1(int[] input, int[] input1) {
        int num = 0;
        if (input[0] == 1) {
            num = 1;
        }
        if (input1.length >= 1) {
            if (input1[0] == 1) {
                num++;

            }
        }

        return num;
    }

    private static int[] makeLast(int[] array) {
        int[] output = new int[array.length * 2];
        for (int i = 0; i < output.length; i++) {
            output[i] = 0;


        }
        output[output.length - 1] = array[array.length - 1];
        return output;

    }

}
