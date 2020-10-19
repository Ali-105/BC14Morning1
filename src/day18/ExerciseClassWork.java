package day18;

public class ExerciseClassWork {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));// → true
        System.out.println(prefixAgain("abXYabc", 2));// → true
        System.out.println(prefixAgain("abXYabc", 3));// → false
       /* System.out.println(makeBricks(3, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true*/


    }

    private static boolean makeBricks(int countSmallBricks, int countBigBricks, int goal) {
        int smallBricks = 1;
        int BigBricks = 5;
        int size = countSmallBricks * smallBricks + countBigBricks * BigBricks;
        if (size >= goal){
            return true;
        }
        return false;
    }

    private static boolean prefixAgain(String str, int n) {
        int length = str.length();
        String prefix = str.substring(0 , n);
        for (int i = n; i < length ; i++) {
            if (n + i <= length){
                if (prefix.equals(str.substring(i, n + i))){
                    return true;
                }
            }// return str.substring(n).contains(str.substring(0; n));

        }
        return false;
    }
}
