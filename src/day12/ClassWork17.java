package day12;

public class ClassWork17 {
    public static void main(String[] args) {
        //System.out.println(inOrder(1, 2, 4, false));// → true
        //System.out.println(inOrder(1, 2, 1, false));// → false
        //System.out.println(inOrder(1, 1, 2, true));// → true
        //System.out.println(endsLy("oddly"));// → true
        //System.out.println(endsLy("y"));// → false
        //System.out.println(endsLy("oddy"));// → false
        //System.out.println(seeColor("redxx")); //→ "red"
        //System.out.println(seeColor("xxred")); //→ ""
        //System.out.println(seeColor("blueTimes"));// → "blue"
        //System.out.println(extraFront("Hello"));// → "HeHeHe"
        //System.out.println(extraFront("ab"));// → "ababab"
        //System.out.println(extraFront("H"));// → "HHH"

        //System.out.println(extraEnd("Hello"));// → "lololo"
        //System.out.println(extraEnd("ab"));// → "ababab"
        //System.out.println(extraEnd("Hi"));// → "HiHiHi
        System.out.println(withoutEnd("Hello"));//→ "ell"
        System.out.println(withoutEnd("java"));// → "av"
        System.out.println(withoutEnd("coding"));// → "odin"
        //System.out.println(left2("Hello"));// → "lloHe"
        //System.out.println(left2("java"));// → "vaja"
        //System.out.println(left2("Hi"));// → "Hi"


    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        String word = str.substring(1, str.length() - 1);
        return word;
    }

    private static String extraEnd(String str) {
        String temp = str.substring(str.length() - 2);
        return temp + temp + temp;

    }

    private static String extraFront(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }


    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        }
        return "";
    }

    private static boolean endsLy(String str) {
        // return str.endsWith("ly");
        if (str.endsWith("ly")) {
            return true;
        }
        return false;
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        //return bOk && b <= a || b>= a && c >= b;
        if (b >= a && c >= b) {
            return true;
        }
        if (bOk && b <= a) {
            return true;
        }
        return false;
    }
}
