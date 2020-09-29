package day15;

public class ReviewFor {
    public static void main(String[] args) {
        System.out.println(checkCyrillicLetterInWord("Василий"));
        System.out.println(checkCyrillicLetterInWord("Семён"));
        System.out.println(checkCyrillicLetterInWord("Яна"));
        System.out.println(checkCyrillicLetterInWord("яблоко"));
    }

    private static boolean checkCyrillicLetterInWord(String str) {
     /*   for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'я' || str.charAt(i)=='Я' ){
                return true;
            }

        }


        return false;*/

        String input = str.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'я') {
                return true;
            }


        }
        return false;
    }
}
