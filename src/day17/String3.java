package day17;

public class String3 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false

    }

    private static boolean bobThere(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='b' && str.charAt(i +2)=='b'){
                return true;
            }

        }
        return false;
    }
}
