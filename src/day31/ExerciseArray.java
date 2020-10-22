package day31;

public class ExerciseArray {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 1, 3, 5};
        int[] arr1 = new int[]{2, 1, 2, 5};
        int[] arr2 = new int[]{2, 4, 2, 5};
       /* System.out.println(modThree1(arr));// → true
        System.out.println(modThree1(arr1));// → false
        System.out.println(modThree1(arr2));// → true*/


        int[] a = new int[]{1,2,3};
        int[] b = new int[]{2,3,10};
        int[] a1= new int[]{1,2,3};
        int[] b1 = new int[]{2,3,5};
        int[] a2 = new int[]{1,2,3};
        int [] b2 = new int[]{2,3,3};
        System.out.println(matchUp(a, b));// → 2
        System.out.println(matchUp(a1, b1));// → 3
        System.out.println(matchUp(a2, b2));// → 2



    }

    private static int matchUp(int[] x, int[] y) {
        int diff = 0;
        int count = 0;
        for (int i = 0; i <x.length ; i++) {
            diff = Math.abs(x[i] - y[i]);
            if (diff == 1 || diff == 2){
                count ++;
            }

        }
        return count;
    }


    private static boolean modThree1(int[] input) {
        for (int i = 1; i < input.length - 1; i++) {
            if (input[i] % 2 == 0 && input[i+ 1] % 2 == 0 && input[i -1] % 2 == 0) {
                return true;
            }
            if (input[i] % 2 == 1 && input[i + 1]  % 2 == 1 && input[i -1] % 2 == 1) {
                return true;
            }

        }
        return false;
    }

}
