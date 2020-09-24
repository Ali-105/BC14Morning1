package day5;

public class ClassWork {
    public static void main(String[] args) {
        String s1 = " Alihan";
        System.out.println(helloName(s1));
        System.out.println(helloName(" Alihan"));
        System.out.println(helloName(" Kurbanov"));
        System.out.println("Brutto Pries" + pirogiPreis(3) + '$');


    }

    public static double pirogiPreis(double nettoPreis){
       double mwst = 5;
       double result= nettoPreis * mwst/100 + nettoPreis;
       return result;
        }

        public  static String helloName(String userName){
        return "Hello" + userName;
    }
}
