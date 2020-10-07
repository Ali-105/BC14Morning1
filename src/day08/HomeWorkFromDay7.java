package day08;

public class HomeWorkFromDay7 {
    public static void main(String[] args) {
        System.out.println(love(6, 4));
        //true
        System.out.println(love(4, 5));
        //false
        System.out.println(love(1, 5));
        //true

    }

    public static boolean love(int a, int b) {
        boolean result = (a == b) || (b == 6) || (a + b == 6) || (Math.abs(a - b) == 6);
        return result;
    }
}
