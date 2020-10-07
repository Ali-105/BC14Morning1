package day06.hw;

public class HomeWork1 {
    public static void main(String[] args) {
        String s1 =("<<>> Yay");
        String s2 =("<<>> WooHoo");
        String s3 =("[[]] word");
        int dlina = s1.length();
        int dlina2 = s2.length();
        int dlina3 = s3.length();
        //System.out.println(dlina);
        //System.out.println(dlina2);
        //System.out.println(dlina3);
       String decision= s1.substring(0,2) + s1.substring(dlina -4) + s1.substring(2,4);
        System.out.println(decision);
        String decision1 = s2.substring(0, 2) + s2.substring(dlina2 -6) + s2.substring(2,4);
        System.out.println(decision1);
        String decision2 = s3.substring(0, 2) + s3.substring(dlina3 -4) +s3.substring(2, 4);
        System.out.println(decision2);
    }
}
