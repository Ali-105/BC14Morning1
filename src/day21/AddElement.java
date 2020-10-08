package day21;

import day20.FillAndPrintIntArray;

public class AddElement {
    public static void main(String[] args) {
        int[] customerArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int key = 2; // index element
        int value = 100;
        int[] badCustommerArray = new int[]{- 56, - 45, - 67};
        int number = 2;
        int element = 10000;
        addElement(badCustommerArray, key, value);
        addElement(customerArray, key, value);
        FillAndPrintIntArray.myPrintIntArray(addElement(customerArray, key, value));
        FillAndPrintIntArray.myPrintIntArray(addElement(badCustommerArray, key , value));
    }

    private static int[] addElement(int[] input, int index, int value) {
        int[] result = new int[input.length +1];
        for (int i = 0; i <index ; i++) {
            result[i]=input[i];

        }
        result[index] = value;
        for (int i = index + 1; i < result.length ; i++) {
            result[i]= input[i - 1];

        }
         return result;
    }
}
