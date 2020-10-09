package day23.hm;

public class ExerciseHm {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"
    }

    private static String repeatSeparator(String str1, String str2, int number) {
        String result = "";
        if (number==3){
            return(str1 + str2 + str1 + str2 + str1);

        }else if (number == 2){
            return str1 + str2 + str1;
        }else{
            return str1;
        }

    }
}
