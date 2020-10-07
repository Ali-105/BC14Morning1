package day03;

public class HelloDouble {
    public static void main(String[] args) {
        // double - десятичные дроби
        double a = 5.0,b, c, d;
        b = 3.0;
        c = 7.0;
        d = a / c;

        System.out.println(d);

        int var1 = 5;
        int var2 = 2;
        double var3 = var1/var2; // целое число деляться = 0, затем double добавляет к 0 - * .0

        System.out.println(var3);
    }
}
