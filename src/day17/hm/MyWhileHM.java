package day17.hm;

public class MyWhileHM {
    public static void main(String[] args) {
        
       // Даны целые числа A и B, где B > 0. Вывести B раз число A.
     //myWhile();
     myWhile2();
    }

    private static void myWhile2() {
        int a = 5;
        while (a > 0){
            int b = 17;
            while (b >= a){
                System.out.println(a);
                a++;
            }
        }
    }

    private static void myWhile() {
        int a = 6;
        int b =3;
        while (b>0){
            System.out.println(a);
            b--;
        }

    }
}
