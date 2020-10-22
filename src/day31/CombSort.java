package day31;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int [] arr = CocteilSort.createIntArray(10);
        System.out.println(Arrays.toString(arr));
        int[] myCopy = new int[arr.length];
        System.arraycopy(arr, 0, myCopy, 0, arr.length);
        combSort(myCopy);
        System.out.println(Arrays.toString(myCopy));
    }

    private static void combSort(int[] input) {
        final double stepConstant = 1.24733095;
        int step = input.length;
        while(step>1){
            step = (int) (step / stepConstant);
            System.out.println(step + "step");
            for (int i = 0; step + i < input.length; i++) {
                if (input[i] > input[i + step]){
                    CocteilSort.swapTwoElementsInIntArray(input, i, i + step);
                }

            }
        }
    }
}
