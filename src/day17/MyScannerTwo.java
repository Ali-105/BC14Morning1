package day17;

import java.util.Scanner;

public class MyScannerTwo {
    public static void main(String[] args) {
        //myNextInt();
        myPersident();
    }

    private static void myPersident() {
        int vote1;
        int vote2;
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Stimmen wurde fur Kandidat 1");
        vote1 = input.nextInt();
        System.out.println("Wie viele Stimmen wurde fur Kandidat 2");
        vote2 = input.nextInt();

        if (vote1 > vote2 && vote1 > 50) {
            System.out.println("Kandidat1 gewonnen");
        } else if (vote2 > vote1 && vote2 > 50) {
            System.out.println("Kandidat2 gewonnen");
        } else {
            System.out.println("soll neue Wahlen durchgeführt werden");
        }

    }

    private static void myNextInt() {
        int userAge;
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Alter");
        userAge = input.nextInt();
        System.out.println("es ist richtig " + userAge);
        boolean b = input.nextBoolean();
        System.out.println("Geschrieben " + true);
        input.close();
    }
}
