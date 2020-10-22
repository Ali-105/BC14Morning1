package day33;

public class MinesSwiper {
    public static void main(String[] args) {
        creatyField(10);
    }

    private static void creatyField(int x) {
        String minus = "-";
        String bombe = "*";
        int  xbombe =10 / 100 * 10;
        for (int i = 0; i < x ; i++) {
            for (int j = 0; j <x ; j++) {
                System.out.print(minus);
                System.out.print(bombe);
            }
            System.out.println();

        }
    }
}
