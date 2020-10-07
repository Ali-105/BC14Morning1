package day09;

public class MyLife {
    public static void main(String[] args) {
        lop();
        forIntrodukctionOne();
        forIntrodukctionTwo();

    }

    private static void forIntrodukctionTwo() {
        for (int i = 1; i < 10; i*=2) {
            System.out.println(i + "Schagi");
            
        }
    }

    private static void forIntrodukctionOne() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a++;

        }
        for (int i = 0; i < 20; i++) {
            a++;
        }
        int i = 10;
        System.out.println(a);
        System.out.println(i);
    }

    private static void lop() {
        int workWeekDays = 5;
        int j = 0;
        // Poka j mensche workWeekdays
        j = j + 1;
        // nachalo, uslovie; schag
        for (int i = 0; i < workWeekDays; i++) {
            System.out.println("--------");
            System.out.println("Novii den");
            System.out.println("Rabota");
            System.out.println("Uzhin");
            System.out.println("spazt");

        }
    }
}
