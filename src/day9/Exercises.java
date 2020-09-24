package day9;

public class Exercises {
    public static void main(String[] args) {
        happyPelmen();
        moduloThree();
        //myLine();
        System.out.println(paris(11, 15));
        System.out.println(paris(11, 5));//<-> true
    }

    private static void happyPelmen() {
        for (int i = 1; i <10 ; i++) {
            if (i == 5);
            System.out.println("Man hat sie");
            break;
        }

    }

    private static void moduloThree() {
        for (int i = 1; i < 100; i++) {
            if (i%3==0);
            System.out.println("" + i);

        }
    }

    private static boolean paris(int a, int b) {
        if (a + b <= 25) {
            return true;
        }else return false;
    }
}
