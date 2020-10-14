package day25;

import day20.FillAndPrintIntArray;

public class HomeWork1 {
    public static void main(String[] args) {
       // System.out.println(zipZap("zipXzap"));// → "zpXzp"
       // System.out.println(zipZap("zopzop"));// → "zpzp"
       // System.out.println(zipZap("zzzopzop"));// → "zzzpzp"

        //Return the number of even ints in the given array.
        // Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
        /*int[] count1 = new int[]{2, 1, 2, 3, 4};
        int[] count2 = new int[]{2, 2, 0};
        int[] count3 = new int[]{1, 3, 5};
        System.out.println(countEvens(count1));//3
        System.out.println(countEvens(count2));//3
        System.out.println(countEvens(count3));//0*/

      /*  int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{1, 1};
        int[] arr3 = new int[]{1, 2, 2, 1, 13};
        int[] arr4 = new int[]{1, 2, 2, 1, 13, 15, 15};
        System.out.println(sum13(arr1));// → 6
        System.out.println(sum13(arr2));// → 2
        System.out.println(sum13(arr3));// → 6
        System.out.println(sum13(arr4));// → 21*/

        int[] arrr1 = new int[]{0, 2, 4};
        int[] arrr2 = new int[]{1, 2, 3};
        int[] arrr3 = new int[]{1, 2, 4};

        System.out.println(lucky13(arrr1));// → true
        System.out.println(lucky13(arrr2));// → false
        System.out.println(lucky13(arrr3));// → false

    }

    private static boolean lucky13(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 1 || arr[i] == 3){
                return false;
            }

        }

        return true;
    }

    private static int sum13(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 13 || i > 0 && arr[i - 1] == 13){

            }else {
                sum = sum + arr[i];
            }

        }

        return sum;
    }

    private static int countEvens(int[] input) {
        int count = 0;
        for (int element : input){
            if(element % 2 == 0){
                count ++;
            }

        }

        return count;
    }

    private static String zipZap(String str) {
        String output = "";
        output = str.replaceAll("z.p", "zp");
        return output;
    }

    private static String zipZapOne(String str) {
        String result = str;
        for (int i = 1; i < result.length() - 1; i++) {
            if (result.charAt(i - 1) == 'z' && result.charAt(i + 1) == 'p') {
                result = result.substring(0, i) + result.substring(i + 1);
            }

        }
        return result;
    }
}
