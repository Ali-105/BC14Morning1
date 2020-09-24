package day11.hm;

public class Execise3 {
    public static void main(String[] args) {
        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
    }

    private static boolean old35(int a) {
        if (a % 3 == 0 ^ a % 5 == 0){
            return true;
        }return false;
    }
}
