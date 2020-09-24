package day11;

public class Execise6Andrias {
    public static void main(String[] args) {
        //System.out.println(twoAsOne(1, 2, 3));// → true
        //System.out.println(twoAsOne(3, 1, 2));// → true
        //System.out.println(twoAsOne(3, 2, 2));// → false
        System.out.println(lastDigit(23, 19, 13));// → true
        System.out.println(lastDigit(23, 19, 12));// → false
        System.out.println(lastDigit(23, 19, 3));// → true
        //Если три дюйма, a b c, возвращают истину,
        //если две или более из них имеют одну и ту же самую правую цифру.
                //Инты неотрицательны. Примечание:
        //оператор % "mod" вычисляет остаток, например, 17 % 10 равно 7.
    }

    private static boolean lastDigit(int a, int b, int c) {
        if (a % 5 == b % 5 || b % 5 == c % 5 || c % 5 == a % 5){
            return true;
        }


        return false;
    }

    private static boolean twoAsOne(int a, int b, int c) {
        if (a + b == c || b + c == a || a + c == b) {
            return true;

        }
        return false;
    }
}
