package day14;

public class MyFor {
    public static void main(String[] args) {
        int rectangle = 10;
        int a = 1;
        for (int i = 1; i < rectangle ; i++) {
            for (int j = i; j < i; j++) {

                System.out.print("+");

            }
            for (int j = 1; j < a; j++) {
                System.out.print("*");
                a --;

            }


        }
        for (int i = 0; i < rectangle; i++) {
            for (int j = rectangle; j > i; j--) {
                System.out.print("+");

            }
            System.out.println("*");

        }

    }


}






