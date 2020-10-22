package day32;

public class ExerciseArray {
    public static void main(String[] args) {
        /*System.out.println(makeChocolate(4, 1, 9));// → 4
        System.out.println(makeChocolate(4, 1, 10));// → -1
        System.out.println(makeChocolate(10, 1, 15));// → 10
        System.out.println(makeChocolate(4, 1, 7));// → 2
        System.out.println(makeChocolate(5, 2, 15));// → 5*/

        /*System.out.println(closeFar(1, 2, 10));// → true
        System.out.println(closeFar(1, 2, 3));// → false
        System.out.println(closeFar(4, 1, 3));// → true*/

        System.out.println(luckySum(1, 2, 3));// → 6
        System.out.println(luckySum(1, 2, 13));// → 3
        System.out.println(luckySum(1, 13, 3));// → 1

    }

    private static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13){
            sum = 0;
        }if (b == 13){
            sum = a;
        }if (c == 13){
            sum = a + b;
        }
        return sum;
    }

    private static boolean closeFar(int a, int b, int c) {
         int diff1 =Math.abs(a -b);
         int diff2 = Math.abs(a -c);
        return diff1<=1 && diff2 >2 || diff1 > 2 && diff2 <=1;

    }

    private static int makeChocolate(int smal, int big, int goal) {
        if (big * 5 + smal == goal) {
            return smal;
        }
        if (big * 5 + smal < goal) {
            return -1;
        }
        if (big * 5 + smal > goal) {

        }
        return big * 5 + smal - goal;
    }
}
