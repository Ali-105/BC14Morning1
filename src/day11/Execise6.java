package day11;

public class Execise6 {
    public static void main(String[] args) {
        //threeNumber();
        threeAngle(10 );
    }

    private static void threeAngle(int lines) {
        String star = "*";
        String myLine = "";
        for (int i = 0; i < lines; i++) {
            myLine = myLine + star;
            System.out.println(myLine);
        }


    }

    private static void threeNumber() {
        int count = 1;
        for (int x = 36; x <= 36; x--) {
            for (int y = x; y <= 36; y--) {
                for (int z = y; z <= 36; z--) {
                    if (x - y - z == 0) {
                        System.out.println(count + "Wariant gde " + " x=" + x
                                + " y=" + y + " z=" + z
                        );
                        count++;


                    }

                }

            }

        }
    }
}
