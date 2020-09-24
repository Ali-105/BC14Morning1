package day4;

public class HW {
    public static void main(String[] args) {
        int r= 5;
        findCircumferens(r);
        findCircumferens(7);
        findCircumferens(10);
        double moneyInEuro = 1000;
        currencyConverter(moneyInEuro, 1.1);

    };
    public static void findCircumferens(int r){
        // L = 2PI * radius
        System.out.println( 2 * Math.PI * r);
    }
    public static void currencyConverter(double euro, double course){
        System.out.println(euro*course + "- количество долл. ." + euro);
    }

}
