package day13;

public class MyFirstPassword {
    public static void main(String[] args) {
        String myLittlePassword = "dkcmcnkcldmdojdm";
        generaterPassword(20);
        generaterPassword(7);
        generaterPassword(13);
        
    }

    private static void generaterPassword(int userInput) {
        String result = "";
        for (int i = 0; i < userInput; i++) {
            int min = 65;
            int max = 90;
            char c = (char)((Math.random() * (max-min) + 1) + min);
            result += c;
            System.out.print(result);

        }
    }
}
