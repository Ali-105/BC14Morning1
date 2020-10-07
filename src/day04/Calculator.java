package day04;

public class Calculator {
    public static void main(String[] args) {
        addition1();
        int a = 100 ;
        int b = 200;
        addition2 (a, b);
        int ergebniss = addition3(a, b);
        System.out.println(ergebniss);
        System.out.println(addition4(a, b));
    }
    public static int addition4 (int a, int b){
        return a + b ;
    }

    public static int addition3(int a, int b){
        int c = a + b;
        return c;
    }
     public static void addition2 (int a, int b){
        int result = a +b;
        System.out.println("результат раб. метода-" + result);
    }
    public static void addition1(){
        int a = 5;
        int b = 6;
        int c = a + b;
        System.out.println("результат сложения-" + c);

    }
}
