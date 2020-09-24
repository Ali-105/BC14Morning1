package day6;

public class HelloCase {
    public static void main(String[] args) {
       anotherHello();
       helloUpperCase();
        String masterName = "Vasilii";
        int i = 2;
        int j = 6 ;
        System.out.println(masterName.substring(i, j));
    }
    public static void anotherHello(){
    String teacher ="Andrei";
        System.out.println("andrej".toUpperCase());
        System.out.println(teacher.toLowerCase());
    }
    public static void helloUpperCase(){
        String source = "london is the capital of great britain";
        System.out.println(source);
        String phrase2= source.toUpperCase();
        System.out.println(phrase2);
        String phrase3 = source.substring(0,6).toUpperCase() + source.substring(6);
        System.out.println(phrase3);

    }

    }
