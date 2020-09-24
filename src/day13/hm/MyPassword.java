package day13.hm;

public class MyPassword {
    public static void main(String[] args) {
        generaterPassword();
    }

    private static void generaterPassword() {
        String result = "";
        for (int i = 0; i < 5; i++) {
            char min = (49) + (69) + (99);
            char max = (119) +(89) +(49);
            char c= (char) ((Math.random() * (max - min) +1) - min);
            result += c;
            System.out.print(result);
        }



    }
}
