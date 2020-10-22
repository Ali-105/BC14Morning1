package day32;


public class Triangle {
    public static void main(String[] args) {
        creatyTriangle(5);


    }

    private static void creatyTriangle(int number) {
        String line = "";
        String star = "*";

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j <= number; j++) {
                System.out.print(star + line);



                }
            System.out.println("");
            }


        }


    }


