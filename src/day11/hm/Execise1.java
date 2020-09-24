package day11.hm;

public class Execise1 {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));// → 20
        System.out.println(sortaSum(10, 11));// → 21

    }

    private static int sortaSum(int a, int b) {
        int ab = a + b;
        if (ab >= 10 && ab <= 19) {
            return 20;
        } else if (ab >= 19) {
            return 21;
        }
        return ab;
    }

}
