package day06;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println("Brutto Preis" + pirogiPreis(3) + "$");
        String s1 = " Alihan";
        System.out.println(helloName(s1));
        System.out.println(helloName( " Rasul Kurbanov"));
        System.out.println(helloName( " Muhammad"));

    }
    public static double pirogiPreis(double nettoPreis){
    double mwst = 5;
    double result = nettoPreis * mwst/ 100 + nettoPreis;
    return result;
    }
    public static String helloName(String userName){
        return "Hello"   + userName;
    }
}
