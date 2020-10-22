package day31;

public class ExerciseArray1 {
    public static void main(String[] args) {

        int [] arr = {5, 6, 45, 99, 13, 5, 6};
        int [] arr1 = {5, 6, 45, 99, 13, 5, 6};
        int [] arr2 ={5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr, 1));// → false
        System.out.println(sameEnds(arr1, 2));// → true
        System.out.println(sameEnds(arr2, 3));// → false

    }

    private static boolean sameEnds(int[] input, int num) {
        for (int i = 0; i <num ; i++) {
            if (input[i] == input[input.length - num +i])
             return true;
        }
        return false;
    }
}
