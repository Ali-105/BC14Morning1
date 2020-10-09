package day23;

import day20.FillAndPrintIntArray;

import static day07.HelloBoolean.split;

public class ExerciseArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{4, 5, 6};
        middleWay(arr, arr1);
        myPrintInArray(middleWay(arr, arr1));
        int[] arr2 = new int[]{7, 8, 9};
        int[] arr3 = new int[]{10, 11, 12};
        middleWay(arr2, arr3);
        myPrintInArray(middleWay(arr2, arr3));
        split();
        int[] arr4 = new int[]{4, 5};//->true
        System.out.println(no23(arr4));
        int[] arr5 = new int[]{4, 2};//->false
        System.out.println(no23(arr5));
        int[] arr6 = new int[]{3, 5};//->false
        System.out.println(no23(arr6));
        split();
        int[] fix1 = new int[]{1, 2, 3};
        int[] fix2 = new int[]{2, 3, 5};
        int[] fix3 = new int[]{1, 2, 1};
        int[] fix4 = new int[]{3, 2, 1};
        fix23(fix1);
        myPrintInArray(fix23(fix1));
        fix23(fix2);
        myPrintInArray(fix23(fix2));
        fix23(fix3);
        myPrintInArray(fix23(fix3));
        fix23(fix4);
        myPrintInArray(fix23(fix4));
    }

    private static int[] fix23(int[] input) {
        for (int i = 0; i <input.length ; i++) {
         if (input[i] == 2 && input[i + 1]== 3){
             input[i + 1] = 0;
         }
        }
        return input;
    }

    private static boolean no23(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 2 || input[i] == 3) {
                return false;
            }

        }
        return true;
    }

    private static void myPrintInArray(int[] input) {
        for (int element : input) {
            System.out.print(element + " ");

        }
        System.out.println();
    }

    private static int[] middleWay(int[] arr, int[] arr1) {
        int[] output = new int[2];
        output[0] = arr[1];
        output[1] = arr1[1];
        return output;

    }
}
