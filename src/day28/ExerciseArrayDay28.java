package day28;

public class ExerciseArrayDay28 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1, 2, 3};
        System.out.println(unlucky13(arr1));// → true
        System.out.println(unlucky13(arr2));// → true
        System.out.println(unlucky13(arr3));// → false



       /* int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{1, 2, 3, 1};
        int[] arr2 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(arr));// → false
        System.out.println(sameFirstLast(arr1));// → true
        System.out.println(sameFirstLast(arr2));// → true*/

        /*int[] arr = new int[]{1, 2, 3};
        int [] arr1 = new int[]{5, 11 , 2};
        int[] arr2 = new int[]{7, 0, 0};
        System.out.println(sum3(arr));// → 6
        System.out.println(sum3(arr1));// → 18
        System.out.println(sum3(arr2));// → 7*/


    }

    private static int sum3(int[] num) {
        int result = 0;
        for (int element : num) {
            result = result + element;
        }
        return result;
    }

    private static boolean sameFirstLast(int[] num) {

        return num[0] == num[num.length - 1] && num.length >= 1;
    }

    private static boolean unlucky13(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1 && num[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }
}
