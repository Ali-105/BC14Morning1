package day17;

public class Execise4 {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));// → "llollollo"
        System.out.println(repeatEnd("Hello", 2));// → "lolo"
        System.out.println(repeatEnd("Hello", 1));// → "o"
    }

    private static String repeatEnd(String hello, int a) {
        String output = "";
        for (int i = 0; i < a ; i++) {
            output += hello.substring(hello.length()-a);
        }

        return output;
    }
}
