package day20.hm;

public class Exercise8 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findMin(arr) + " Min number");
        System.out.println(findMax(arr) + "Max number");
        System.out.println(findMiddle(arr) + "Mddle number");
        System.out.println(findSum(arr) + " Sum number");
    }

    private static int findSum(int[] input) {
        int sum = input[0];
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
        }
        return sum;
    }

    private static int findMiddle(int[] input) {
        int sum = 0;
        int middle = 0;
        for (int i = 0; i < input.length; i++) {
            sum = sum + input[i];
            middle = sum / input.length;

        }
        return middle;
    }

    private static int findMax(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            max = Math.max(max, input[i]);
        }
        return max;
    }

    private static int findMin(int[] input) {
        int min = input[0];
        for (int i = 0; i < input.length; i++) {
            min = Math.min(min, input[i]);
        }
        return min;
    }
}

