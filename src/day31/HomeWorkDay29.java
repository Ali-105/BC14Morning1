package day31;

import java.util.Arrays;

public class HomeWorkDay29 {
    public static void main(String[] args) {
        char[] charArr1 = new char[]{'!', '§', '&', '$'};
        String str = "В лесу родилась ёлочка красивая";
        char[] charArr2 = str.toCharArray();

       /* sortOin(charArr1);
        System.out.println(Arrays.toString(charArr1));
        sortOin(charArr2);
        System.out.println(Arrays.toString(charArr2));*/
        sortLex(charArr2);
        System.out.println(Arrays.toString(charArr2));
    }

    private static void sortLex(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            String x = String.valueOf(arr[i]);
            String y = String.valueOf(arr[i +1]);
            if (x.compareTo(y) >0) {
                swapNormal(arr, i, i + 1);
                count++;
            }

        }
        if (count > 0) {
            sortOin(arr);
        }
    }



    private static void sortOin(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                swapNormal(arr, i, i + 1);
                count++;
            }

        }
        if (count > 0) {
            sortOin(arr);
        }
    }




    private static void swapNormal(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
