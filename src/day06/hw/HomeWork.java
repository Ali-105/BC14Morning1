package day06.hw;

public class HomeWork {

    public static void main(String[] args) {
        String person1, person2, person3;
        person1= "Bob";
        person2 = "Alice";
        person3 = "X!";
        helloName(person1);
        helloName(person2);
        helloName(person3);
        helloName("Ali");

    }
    public static void helloName(String Nameuser){
        System.out.println("Hello " + Nameuser);
    }
}
