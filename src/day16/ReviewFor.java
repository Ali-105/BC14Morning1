package day16;

public class ReviewFor {
    public static void main(String[] args) {
        String word = "Ich mag Berlin";
        String word1 = "Ich brauche Brezehl";
        String word2 = "ich gehe spazieren";
        String all = word + word1 + word2;
        System.out.println(countB(word));//1
        System.out.println(countB(word1));//2
        System.out.println(countB(word2));//0
        System.out.println(countB(all));


    }

    private static int countB(String original) {
        int count = 0;
        String input = original.toLowerCase();
        char B = 'b';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b') {
                count++;
            }
        }
        return count;
    }
}
