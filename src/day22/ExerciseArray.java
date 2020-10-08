package day22;

import day20.FillAndPrintIntArray;

public class ExerciseArray {
    public static void main(String[] args) {
       /* int[] arr = new int[]{1, 2, 6};
        System.out.println(firstLast6(arr));// →true
        int[] arr1 = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(arr1));// →true
        int[] arr2 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(arr2));// →false*/

       int[] a = new int[]{1, 2, 3};
       int [] a1 = new int[]{7, 3};
        System.out.println(commonEnd(a, a1));// → true
        int[] b = new int []{1, 2, 3};
        int[] b1 = new int[]{7,3,2};
        System.out.println(commonEnd(b, b1));// → false
        int[] c = new int[]{1, 2, 3};
        int [] c1 = new int[]{1, 3};
        System.out.println(commonEnd(c, c1));// → true


        int[] arr = new int[]{1, 2, 3};
        System.out.println(reverse3(arr));// → [3, 2, 1]
        int[] arr1 = new int[]{5, 11, 9};
        System.out.println(reverse3(arr1));// → [9, 11, 5]
        int [] arr2 = new int[]{7, 0, 0};
        System.out.println(reverse3(arr2));// → [0, 0, 7];
        FillAndPrintIntArray.myPrintIntArray(reverse3(arr));
        FillAndPrintIntArray.myPrintIntArray(reverse3(arr1));
        FillAndPrintIntArray.myPrintIntArray(reverse3(arr2));


    }

    private static int[] reverse3(int[] array) {
      /*  int[] output = new int[3];
        output[0] = array[2];
        output [1] = array[1];
        output [2] = array[0];*/
        int [] output = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            output[output.length -1 - i]= array[i];

        }
        return output;

    }

    private static boolean commonEnd(int[] array1, int[] array2) {
        if (array1[array1.length - 1] == array2[array2.length - 1] ||
        array1[0] == array2[0]){
            return true;
        }
        return false;
    }

    private static boolean firstLast6(int[] number) {
        for (int i = 0; i < number.length ; i++) {
            if (number[0] == 6 || number[number.length - 1] == 6){
                return true;
            }

        }
        return false;
    }
}
