package day15;

public class MyLovelyRubel {
    public static void main(String[] args) {
        printSumInRub(1, 5);
    }

    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));

        }
    }

    private static String rightWordInRussian(int number) {
        String output= "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (lastDigit==1){
            output = "rubl";
        }else if (lastDigit >= 5 || lastDigit == 0){
            output = "rubley";
        }else{
            output = "rublya";
        }

        return output;
    }
}
