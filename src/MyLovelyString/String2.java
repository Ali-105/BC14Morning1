package MyLovelyString;

public class String2 {
    public static void main(String[] args) {
        /*System.out.println(countCode("aaacodebbb"));// → 1
        System.out.println(countCode("codexxcode"));// → 2
        System.out.println(countCode("cozexxcope"));// → 2
*/
        System.out.println(bobThere("abcbob"));// → true
        System.out.println(bobThere("b9b"));// → true
        System.out.println(bobThere("bac"));// → false

    }

    private static boolean bobThere(String str) {
        for (int i = 0; i <str.length(); i++) {
           if (str.charAt(i) == 'b' && str.charAt(i +2) == 'b'){
               return true;
           }
        }

        return false;
    }

    private static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e'){
                count++;
            }

        }

        return count;
    }
}
