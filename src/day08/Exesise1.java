package day08;

public class Exesise1 {
    public static void main(String[] args) {
        mySecondLine(1000);
    }

    private static void mySecondLine(int a) {
        for (int i = 1; i < a; i *= 2) {
            System.out.print(i + " ");


        }
    }
}
