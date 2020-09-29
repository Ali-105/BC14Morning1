package day15;

public class CheckPalindrom {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true
        System.out.println(checkPalindrom("поп"));// -> true
        System.out.println(checkPalindrom("школа"));// -> false

    }

    private static boolean checkPalindrom(String str) {
        String input = removeSpaces(str);
        String strReverse = readBack(input);
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)){
                return false;
            }
            
        }


        return true;

        }






    public static String removeSpaces(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
                input = input.toLowerCase();
            }


        }
        return input;

    }

    public static String readBack(String input) {
        String strReverse = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);


        }
        return strReverse;


    }

}







