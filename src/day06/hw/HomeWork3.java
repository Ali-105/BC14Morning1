package day06.hw;

public class HomeWork3 {
    public static void main(String[] args) {
        //nonStart("Hello", "There") → "ellohere"
        //nonStart("java", "code") → "avaode"
        //nonStart("shotl", "java") → "hotlava"
        String nonStart = "Hello There";
        String nonStart1 = "java code";
        String nonstart2 = "shotl java";
        int a = nonStart.length();
        int b = nonStart1.length();
        int c = nonstart2.length();
        String decision = nonStart.substring(1,5)+nonStart.substring(a-4);
        System.out.println(decision);
        String decision1= nonStart1.substring(1,4) + nonStart1.substring(b-3);
        System.out.println(decision1);
        String decision2= nonstart2.substring(1,5)+ nonstart2.substring(c-3);
        System.out.println(decision2);


    }
}
