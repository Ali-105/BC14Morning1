package day04;

public class DoubleReview {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        roundNumber3();
        //myNotLovelyRoud();
        //myLovelyRoud(pi);
    }

    public static void roundNumber3() {
        double pi = Math.PI;
        double pi2 = Math.floor(pi);
        System.out.println(pi2);
        double pi3 = Math.ceil(pi);
        System.out.println(pi3);
        double pi4 = Math.round(pi);
        System.out.println(pi4);
    }

    public static void myNotLovelyRoud(){
        double pi = Math.PI;
        int newNumber1 = (int) (Math.round(pi * 100) / 100);
            System.out.println(pi);
            // return Math.round(value * scale) / scale;
    }
    public static void myLovelyroud(double number){
        double result = 0.0;
        int k = 100;
        double temp = number * k;
        System.out.println(temp);
        int temp2= (int) temp;
        System.out.println(temp2);
        result=temp2;
        result=result/k;
        System.out.println(result);
    }

}
