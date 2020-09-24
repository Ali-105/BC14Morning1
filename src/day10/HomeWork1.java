package day10;

public class HomeWork1 {
    public static void main(String[] args) {
        multiplicitiMethod(0, 100);
        split();
        evenNumber(0, 100);
        split();
        oddNumber(0, 100);
        split();
        findPreimNumber(0, 100);
        split();
        findNumber();

    }

    private static void findNumber() {

    }

    private static void findPreimNumber(int a3, int b3) {
        for (int i = a3; i <b3 ; i++)
           if (i % i == 0 && i % 1 == 0) {
               System.out.println(i);
            }
    }

    private static void split() {
        System.out.println("-----");
    }

    private static void oddNumber(int a2, int b2) {
        for (int i = a2; i < b2; i++) {
            if (i%2!=0)
            System.out.println(i);

        }
    }

    private static void evenNumber(int a1, int b1) {
        for (int i = a1; i < b1; i++) {
            if (i%2==0)
            System.out.println(i);

        }
    }

    private static void multiplicitiMethod(int a, int b) {
        int number = 11;
        for (int i = a; i < b; i++) {
            if (i % number == 0) {
                System.out.println(i);
            }

        }
    }
}
