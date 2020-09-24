package day11;

public class Execise605 {
    public static void main(String[] args) {
        //System.out.println(nearTen(12));// → true
        //System.out.println(nearTen(17));// → false
        //System.out.println(nearTen(19));// → true
        System.out.println(teaParty(6, 8));// →1
        System.out.println(teaParty(3, 8));// →0
        System.out.println(teaParty(20, 6));// →2


    }

    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }
        return 1;
    }

    private static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8) {
            return true;
        }

        return false;
    }
}
