package day6.hw;

public class HomeWork2 {
    public static void main(String[] args) {
        //firstHalf("WooHoo") → "Woo"
        //firstHalf("HelloThere") → "Hello"
        //firstHalf("abcdef") → "abc"
        String firstHalf = "WooHoo";
        String firstHalf1 = "HelloThere";
        String firstHalf2 = "abcdef";
        int a = firstHalf.length();
        int b = firstHalf1.length();
        int c = firstHalf2.length();
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        String decision = firstHalf.substring(0, 3);
        System.out.println(decision);
        String decision1 = firstHalf1.substring(0, 4);
        String desicion2 = firstHalf2.substring(0, 3);
        System.out.println(decision1);
        System.out.println(desicion2);

    }
}
