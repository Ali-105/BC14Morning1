package MyLovelyString;

public class StringExercise {
    public static void main(String[] args) {
        /*System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"*/

        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false


    }

    private static boolean prefixAgain(String str, int x) {
        String prefix = str.substring(0, x);
        int length = str.length();
        for (int i = x; i < length; i++) {
            if (i + x <= length){
                if (prefix.equals(str.substring(i, i + x))){
                    return true;
                }
            }

        }


        return false;

    }

    private static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i <str.length() ; i++) {
           output = output + str.charAt(i) + str.charAt(i);

        }
        return output;
    }
}
