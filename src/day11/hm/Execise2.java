package day11.hm;

public class Execise2 {
    public static void main(String[] args) {
        System.out.println(in1To10(5, false));//→ true
        System.out.println(in1To10(11, false));// → false
        System.out.println(in1To10(11, true));// → true
    }

    private static boolean in1To10(int n, boolean b) {
         return n >= 1 && n <= 10 || b == true;

    }
}
