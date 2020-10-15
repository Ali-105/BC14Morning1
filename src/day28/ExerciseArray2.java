package day28;

import day20.FillAndPrintIntArray;

public class ExerciseArray2 {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{11, 5, 9};
        int[] arr3 = new int[]{2, 11, 3};
        /*System.out.println(maxEnd3(arr1));// → [3, 3, 3]
        System.out.println(maxEnd3(arr2));// → [11, 11, 11]
        System.out.println(maxEnd3(arr3));// → [3, 3, 3]*/

        methodPrint(maxEnd3(arr1));
        methodPrint(maxEnd3(arr2));
        methodPrint(maxEnd3(arr3));

    }

    private static int[] maxEnd3(int[] arr) {
        int max = Math.max(arr[0] , arr[2]);
        int[] output = new int[]{max, max, max};
        return output;
    }

    private static void methodPrint(int [] input) {
        for (int element: input) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static int[] maxEnd3Second(int[] num) {
        int[] result = new int[num.length];
        int max = 0;
        if (num[0] > num[num.length - 1]) {
            max = num[0];
            for (int i = 0; i < num.length; i++) {
             result [i] = max;
            }
        } else if (num[num.length -1] > num[0]) {
            max = num[num.length -1];
            for (int i = 0; i < num.length; i++) {
                result [i] = max;
            }
        }
        return result;
    }
}

