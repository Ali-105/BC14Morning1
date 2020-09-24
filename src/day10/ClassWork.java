package day10;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));

    }

    private static boolean more20(int number) {
        return ((number % 20) == 1 || (number % 20) == 2);
        }
    }