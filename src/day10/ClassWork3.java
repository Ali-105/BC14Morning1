package day10;

public class ClassWork3 {
    public static void main(String[] args) {
        findVeryGreatNumber(0, 100);
    }

    private static void findVeryGreatNumber(int a, int b1) {
        int greatNumber = 13;
        for (int i = a; i < b1; i++) {
            if (i%greatNumber==0){
                System.out.println(i +"");
            }

        }
    }
}
