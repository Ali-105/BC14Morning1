package day15;

public class MyLovelyOperator {
    public static void main(String[] args) {
        //ifReview();
        myTernar();
    }

    private static void myTernar() {
        String result = (23 > 10) ? "Da" : "Net";
        System.out.println(result);
    }

    private static void ifReview() {
        boolean mamaPermission = true;
        if (mamaPermission){
            System.out.println("Ich fahre");
        }else {
            System.out.println("ich fahre nicht");
        }
    }
}
