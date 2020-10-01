package day17;

import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {

        myScannerOne();
        //myScannerTwo();
    }

    private static void myScannerTwo() {
        Scanner a = new Scanner(System.in);
        int old;
        System.out.println("Wie alt bist du?");
        old= a.nextInt();
        while (old< 18){
            System.out.println("Wir geben keine Alkohol" +
                    "\n geben Sie richtigen Alter");
            old= a.nextInt();
        }
        System.out.println("Alkohol verkauft");
        a.close();
    }

    private static void myScannerOne() {
        Scanner input = new Scanner(System.in);
        int old;
        System.out.println("Wie alt bist du?");
        old = input.nextInt();
        if (old < 18){
            System.out.println("Geben Sie richtigen Alter");
        }else{
            System.out.println("Wilkommen");
        }
        input.close();

    }
}
