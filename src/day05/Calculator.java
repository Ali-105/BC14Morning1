package day05;

public class Calculator {
    ;

    public static void main(String[] args) {
        multiplicationOne();
        concatenation();
       int myLovelyvariable = multiplicationTwo(1, 2, 3, 4);
        System.out.println(myLovelyvariable);

    }

    public static int multiplicationTwo(int a, int b, int c, int d) {
        int result = a * b * c * d;
        System.out.println(" ничего не понятноб чему равно б -" + b);
        System.out.println("резалт алое, ты где " + result);
        return result;
    }

    public static void multiplicationOne(){
        System.out.println("простое перемножение переменных 5 и 6 " + 5 * 6 );
    }

    public static void concatenation(){
        System.out.println("тест на плюс и конкатенацию номер 1: " + 4 + 5 );
        System.out.println("номер 2: " + (4 + 5));
        System.out.println("номер 3: " + (4 + 5) + 3);
        System.out.println("номер 4: " + (4 + 5)+ (3 + 8));
        int a = 1;
        String s = "1";
        System.out.println(a +1);
        System.out.println(s +" "+1);
        System.out.println(s + ' ' + 1);


    }

}
