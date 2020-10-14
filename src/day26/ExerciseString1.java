package day26;

public class ExerciseString1 {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ true  false

        System.out.println(wordEnds("abcXY123XYijk", "XY"));// →"c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// →"13"
        System.out.println(wordEnds("XY1XY", "XY"));// →"11"
    }

    private static String wordEnds(String str1, String strWord) {
        String output = "";
        for (int i = 0; i <str1.length() ; i++) {
            if (str1.charAt(i) == strWord.charAt(0)
                    && str1.charAt(i + 1) == strWord.charAt(2)){
                if (i > 0){
                    output =output + str1.charAt(i - 1);
                }
                if (i < str1.length() - 3){
                    output = output + str1.charAt(i + 2);
                }
            }

        }


        return output;
    }

    private static boolean sameStarChar(String str) {
        char star = '*';
        for (int i = 0; i < str.length() ; i++) {
            if (i == 0 && str.charAt(i) == star){
                return false;
            }else if (str.charAt(i) == star && str.charAt(i + 1) != str.charAt(i-1)){
                return false;
            }

        }
        return true;


    }
}
