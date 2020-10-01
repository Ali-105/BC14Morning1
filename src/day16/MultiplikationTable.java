package day16;

public class MultiplikationTable {
    public static void main(String[] args) {
        createMT(10);
    }

    private static void createMT(int number) {
        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 10 ; j++) {
               // System.out.printf("%3d" , i * j);
                System.out.print(myMTformat(i, j));

            }
            System.out.println();

        }
    }

    private static String myMTformat(int i, int j) {
        String output = "";
        int result = i * j;
        if (result< 10){
            output= "  " + result;
        }else if (result < 100){
            output = " " + result;
        }else {
            output = String.valueOf(result);
        }


        return output;
    }
}
