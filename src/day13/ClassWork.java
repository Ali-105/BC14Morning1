package day13;

public class ClassWork {
    public static void main(String[] args) {
        //myCharArt();
        //myCodePoint();
        //myCodePointBefore();
        //myCodePointCount();
        //myCompareTo();
        //myContains();
        myEquals();
        //MyTrim();
    }

    private static void MyTrim() {
        String str = "    I LOVE JAVA    ";
        System.out.println(str.trim());
    }

    private static void myEquals() {
        String test = "Vasilii";
        String test1 = "vasilii";
        System.out.println(test1.equals(test.toLowerCase()));
    }

    private static void myContains() {
        String hm = "Vasilii";
        String etalon = "l";
        System.out.println(hm.contains(etalon));
        //System.out.println(hm.endsWith(etalon));
    }

    private static void myCompareTo() {
        String str = "Moskov";
        String str1 = "MOSKOV";
        String str2= "Z";

        int result = str.compareTo(str2);
        int result1 = str1.compareTo(str);
        int result2 = str2.compareTo(str1);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void myCodePointCount() {
        String str = "I LOVE JAVA";
        int count = str.codePointCount(1 , 6);
        System.out.println(count);
    }

    private static void myCodePointBefore() {
        String str = "I LOVE JAVA";
        System.out.println(str);
        System.out.println(str.codePointBefore(1));
    }

    private static void myCodePoint() {
        String hm = "Vasilii";
        int test = hm.codePointAt(1);
        System.out.println(test);
    }

    private static void myCharArt() {
        String hausmeister = "Jhkcpkclöcp,md,dppodkd";
        int size = hausmeister.length();
        String fra = hausmeister.substring(9);
        System.out.println(hausmeister.charAt(size - 8));
        String output = " " + hausmeister.charAt(0) + hausmeister.charAt(size - 1)
                + fra;
        System.out.println(output);
    }
}
