package day28;

public class ArrayExercise {
    public static void main(String[] args) {
       /* int [] arr = new int[] {1, 2, 3};
        int [] arr1 = new int[]{1, 2, 3 , 1};
        int [] arr2 = new int[]{1,2,1};
        System.out.println(sameFirstLast1(arr));// → false
        System.out.println(sameFirstLast1(arr1));// → true
        System.out.println(sameFirstLast1(arr2));// → true*/


        int [] arr = new int[]{1, 2, 3};
        int [] arr1 = new int[]{5,11, 2};
        int [] arr2 = new int []{7, 0, 0};
        System.out.println(sum31(arr));// → 6
        System.out.println(sum31(arr1));// → 18
        System.out.println(sum31(arr2));// → 7


    }

    private static int sum31(int[] input) {
        int sum = 0;
        for (int element:input) {
         sum = sum + element;
        }
        return sum;
    }

    private static boolean sameFirstLast1(int[] input) {
        for (int i = 0; i <input.length ; i++) {
            if (input[0] == input[input.length -1] ){
                return true;
            }
        }

        return false;
    }

}
