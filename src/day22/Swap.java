package day22;

public class Swap {
    public static void main(String[] args) {
        swapOne();
        /*swapTwo();
        swapThree();
        swapFor();*/

    }

    private static void swapFor() {
        int a = 5;
        int b = 7;

        a = a + b - (b=a);
    }

    private static void swapThree() {
        int a = 5;
        int b = 7;
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
    }

    private static void swapTwo() {
        int a = 5;
        int b = 7;
        a = a + b; // = 12
        b = a - b; // = 5
        a = a - b; // 12 - 5 = 7;
    }

    private static void swapOne() {
        int a = 5;
        int b = 7;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(b);
    }
}
