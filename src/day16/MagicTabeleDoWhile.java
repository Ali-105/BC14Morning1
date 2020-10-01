package day16;

public class MagicTabeleDoWhile {
    public static void main(String[] args) {
        createMT(10);
    }

    private static void createMT(int number) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.printf("%3d", i * j);
                j++;
            } while (j <= number);
            System.out.println();
            i++;
        } while (i <= number);
    }
}
