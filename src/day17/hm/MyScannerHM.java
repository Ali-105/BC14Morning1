package day17.hm;

import java.util.Scanner;
import java.util.SortedMap;

public class MyScannerHM {
    public static void main(String[] args) {
/*
        Напишите программу, которой надо представиться.
        Данные, которые спрашивает машина: имя, фамилия, пол, возраст, e-mail.
        Для считывания данных типа
        String используйте метод next(): input.next()
*/
        ScannerHomeWork();
        ScannerHomeWork2();
    }

    private static void ScannerHomeWork2() {

    }

    private static void ScannerHomeWork() {
        int Age;
        String geschlecht;
        String name;
        String familieNahme;
        String email;
        Scanner input = new Scanner(System.in);
        System.out.println("Wie alt sind Sie?");
        Age = input.nextInt();
        System.out.println("Ihre Geschlecht?");
        geschlecht = input.next();
        System.out.println("Ihre Name?");
        name = input.next();
        System.out.println("Ihre Familiename?");
        familieNahme = input.next();
        System.out.println("Ihre e - mail");
        email = input.next();
        System.out.println("Wilkommen");


        input.close();
    }
}
