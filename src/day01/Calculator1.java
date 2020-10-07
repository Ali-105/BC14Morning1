package day01;

public class Calculator1 {
    public static void main(String[] args) {
        int a;
        a = 5;
        int b;
        b = 11;
        addition(a, b);
        multiplication();
    }

    public static void addition(int a, int b){
/*        int a = 5;
        int b = 10;*/
        System.out.println("Сложение - " + (a + b));
    }

    public static void multiplication() {
        int a = 5;
        int b = 10;
        System.out.println("Произведение" + a * b);
    }

}
