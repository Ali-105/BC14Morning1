package day27;

public class ExerciseString {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        int x = input.indexOf(star);
        int y = input.lastIndexOf(star);
        output = input.substring(0 ,  x - 1) + input.substring(y + 2);
        return output;
    }
}
