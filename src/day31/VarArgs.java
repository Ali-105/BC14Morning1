package day31;

public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sumTwo(2, 3, 4, 5));
        System.out.println(sumThreeAdultCoder(1, 5, 6, 188, 21));

    }

    private static int sumThreeAdultCoder(int... varargs ) {
        int sum = 0;
        for (int element : varargs) {
            sum += element;

        }
        return sum;
    }

    private static int sumTwo(int x1, int y1, int x, int y) {
        return x + x1 +y +y1;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
