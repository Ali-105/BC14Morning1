package day03;

public class Random {
    public static void main(String[] args) {
        double MyRandom = Math.random();
        System.out.println(MyRandom);
        double newResult = MyRandom * 100;
        System.out.println(newResult);
        int result=(int) newResult;
        System.out.println(result);
        int min = 30;
        int max = 100;
        int myDigit =(int) (Math.random() * (max-min) + 1) + min;
        System.out.println(myDigit);

    }


}
