package day20;

public class FillAndPrintIntArray {
    public static void main(String[] args) {
        int[] source = new int[] {1, 2, 3, 4, 5};
        myPrintIntArray(source);
        int myFillElement = 10;
        fillArray(source, myFillElement);
        myPrintIntArray(source);
    }

    private static void fillArray(int[] arr, int p) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=p;

        }
    }

    public static void myPrintIntArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i] + ".");

        }
        System.out.println();
    }
}