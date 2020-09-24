package day12;

public class ClassWork {
    public static void main(String[] args) {
        //System.out.println(lastChars("last", "chars"));// → "ls"
        //System.out.println(lastChars("yo", "java"));// → "ya"
        //System.out.println(lastChars("hi", ""));// → "h@"
        //System.out.println(startWord("hippo", "hi"));// → "hi"
        //System.out.println(startWord(   "hippo", "xip"));// → "hip"
        //System.out.println(startWord(  "hippo", "i"));// → "h"
        //System.out.println(diff21(19));// → 2
        //System.out.println(diff21(10));//→ 11
        //System.out.println(diff21(21));// → 0
        System.out.println(nearHundred(93));// → true
        System.out.println(nearHundred(90));// → true
        System.out.println(nearHundred(89));// → false
        System.out.println(nearHundred(195));

    }

    private static boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    private static int diff21(int n) {
        return Math.abs(n - 21);
      /*  if (n > 21){
            return 2 * (n - 21);
        }else {
            return 21 - n;
        }*/
    }

    private static String startWord(String a, String b) {
        //if (a.startsWith(b)){
        //return b;}
        if (a.substring(1).startsWith(b.substring(1))) {
            return a.substring(0, 1) + b.substring(1);
        } else
            return a.substring(0, 1);
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";

        }
        return a.substring(0, 1) + b.substring(b.length() - 1);
    }
}
