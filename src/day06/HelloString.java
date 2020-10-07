package day06;

public class HelloString {
    public static void main(String[] args) {
        String student1, student2;
        student1=  "Kurbanov - Murad";
        student2 = "Sidorov Ivan";
        helloUser(student1);
        helloUser(student2);
        helloUser("Alihan");
        char c1 = 140;
        char c2 = (char) (c1 + 20);
        System.out.println("" + c1 +10);
        System.out.println("" + c2 + 10);
    }
    public static void helloUser(String username) {
        System.out.println("Hi " + username + "!");
    }
}
