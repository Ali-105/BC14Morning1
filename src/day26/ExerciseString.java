package day26;

public class ExerciseString {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));// → true
        System.out.println(sameStarChar("xy*zzz"));// → false
        System.out.println(sameStarChar("*xa*az"));// → false

    }

    private static boolean sameStarChar(String str) {
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i -1) == str.charAt(i +1)){
                return true;

            }
        }
        return false;
    }
}
