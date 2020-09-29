package day16;

public class ReallyGreatLoops {
    public static void main(String[] args) {
        //loopForI();
        //whileLoop();
        doWhileLoop();
    }

    private static void doWhileLoop() {
        int i = 11;
        do{
            System.out.println(i);
            i ++;
        }while(i < 19);
    }

    private static void whileLoop() {
        int i = 3;
        while (i<=20){
            System.out.println(i);
            i++;
        }
    }

    private static void loopForI() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);

        }
        for (int j = 20; j > 15 ; j--) {
            System.out.print(j);

        }


    }
}
