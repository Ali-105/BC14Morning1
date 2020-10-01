package day17;

public class ReviewCasting {
    public static void main(String[] args) {
        //inttoChar();
        //charToInt();
        //stringToChar();
        //stringToInt();
        //intToString();
        //charToString();
        magicChar();
        
    }

    private static void magicChar() {
        char c1 = 'a';
        System.out.println(c1);
        System.out.println(c1 + "");
        System.out.println("" + c1);
        System.out.println(c1 + c1 + "");
        System.out.println(c1 + 0);
    }

    private static void charToString() {
        char c1= 125;
        String s1 = String.valueOf(c1);
        System.out.println(s1);
    }

    private static void intToString() {
        int x = 23;
        String a = String.valueOf(x);
        System.out.println(a);
    }

    private static void stringToInt() {
        String hm = "Vasilii";
        String database = "1978";
        int newdatabase = Integer.parseInt(database);
        System.out.println(newdatabase);
    }

    private static void stringToChar() {
        String symbol1 = "$";
        char symbol2 = 'ß';
        String hm = "Vasilii";
        char c1 = hm.charAt(0);
        System.out.println(c1);
    }

    private static void charToInt() {
        char c1 = 'ä';
        char c2 = '\u039A';
        char c3 = 100;
        int x = c1;
        short s = (short) c2;
        byte b = (byte) c3;
        double d = c1;
        System.out.println(x);
        System.out.println(s);
        System.out.println(b);
        System.out.println(d);
    }

    private static void inttoChar() {
        int x = 90;
        byte b = 100;
        char xyz = (char) b;
        char c = (char) x;
        System.out.println(c);
        System.out.println(xyz);

    }
}
