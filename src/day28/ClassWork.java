package day28;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
    }

    private static String plusOut(String str, String word) {
        String result = "";
        String plus = "+";
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == word.charAt(0)){
                for (int j = 0; j <word.length(); j++) {
                    result= result + word.charAt(j);
                    i = i + word.length() -1;

                }
            }else{
                result = result + plus;
            }

        }

        return result;
    }
}
