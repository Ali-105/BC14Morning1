package day21;

public class Hw20 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10};
        int sum = getSum(array);
        System.out.println("Summa " + sum);
        int min = findMin(array);
        System.out.println("Min" + min);
        int max = giveMeMax(array);
        System.out.println("Max" + max);
        double average = tellMeAverage(array);
        System.out.println("Middle arifmetk" + average);
    }

    private static double tellMeAverage(int[] input) {
        return (double) getSum(input) / input.length;
    }

    private static int giveMeMax(int[] array) {
        int max = Integer.MIN_VALUE;
        max = array[0];
        for (int i = 0; i < array.length ; i++) {
            max = (max > array[i]) ? max : array[i];

        }
        return max;

    }

    private static int findMin(int[] array) {
        int min = Integer.MIN_VALUE;
        min = array[0];
        for (int i = 0; i <array.length ; i++) {
            min = (min < array[i]) ? min : array[i];

        }
        return min;
    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int elementik : array) {
            sum = sum + elementik;

        }
        return sum;
    }
}
