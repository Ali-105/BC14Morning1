package day32;

import day30.BubbleSortIntro;

public class ExerciseLogik {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));// → true
        System.out.println(evenlySpaced(4, 6, 2));// → true
        System.out.println(evenlySpaced(4, 6, 3));// → false
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int smal, medium, large;
        int[] arr = new int[]{a, b, c};
        BubbleSortIntro.bubbleSort(arr);
        smal = arr[0];
        medium = arr[1];
        large = arr[2];
        if (medium - smal == large - medium) {
            return true;
        }
        return false;
    }
}
