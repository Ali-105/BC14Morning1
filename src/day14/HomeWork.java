package day14;

public class HomeWork {
    public static void main(String[] args) {
        //MyMultiplicationTable(10);
        //cheesBoard(3);
    }

    private static void cheesBoard(int a ) {
        String star = "*";
        String line = "-";
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= a ; j++) {
                System.out.print(star + line);
            }
            System.out.println();
            for (int j = 0; j <=a ; j++) {
                System.out.print(line + star);

            }
            System.out.println();

        }


    }

    private static void MyMultiplicationTable(int a) {
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= a ; j++) {
                System.out.print( (i * j) + "\t");


            }
            System.out.println();

        }

    }
}
