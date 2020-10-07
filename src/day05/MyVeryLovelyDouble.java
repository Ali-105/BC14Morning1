package day05;

public class MyVeryLovelyDouble {
    public static void main(String[] args) {
        double d1 = 5.151515;
        double d2 =7.171717;
        test();
      System.out.println("Округленное число - " + myRound(d1));
      System.out.println("Округленное число -" + myRound(d2));
      System.out.println("Округленное число -" + myRound(3.13131313));
    }
     public static void test(){
        double number= 6.161616161;
        double temp1 = number * 100;
        System.out.println(temp1);
        int temp2 = (int) temp1;
        System.out.println(temp2);
        double temp3 = temp2/100;
        System.out.println(temp3);
    }
   public static double myRound(double number){
        double result= 0.0;
        // Инпут 5.151515
        // Умножьить на коэфициент 100 -- 515.1515
        // Отрезать дробную часть - 515
        // Cразу не получилось. надо преоброзовать дробь
        // Снова разделить на 100 - 5.15
        double temp1 = number * 100 ;
        System.out.println(temp1);
        int temp2 = (int) temp1;
        System.out.println(temp2);
        double temp3 = temp2;
        System.out.println(temp3);
        result = temp3/ 100;

        return result;
    }


}
