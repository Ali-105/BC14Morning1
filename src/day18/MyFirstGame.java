package day18;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31";
        final String ANSI_GREEN = "\u001B[32";
        Scanner eingabe = new Scanner(System.in);
        int min = 1;
        int max = 50;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        int tryCount = 1;

        System.out.println("Rate meine Zahl");
        int guessNumber = customerInput();

        while (guessNumber != number){
            if (guessNumber < number){
                System.out.println(ANSI_RED + "Meine Zahl ist größe" + ANSI_RESET);
            }else {
                System.out.println("Meine Zahl ist kleine");
            }
            System.out.println("Geben Sie neue Zahl");
            guessNumber= customerInput();
            tryCount++;


        }
        System.out.println(ANSI_GREEN + "Gewonnen" + ANSI_RESET);

        System.out.println("Gemachte popitki" + tryCount);
        System.out.println("Gegebene number" + number);
        eingabe.close();
    }

    private static int customerInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
