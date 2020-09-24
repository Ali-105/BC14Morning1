package day9;

public class HelloIf {
    public static void main(String[] args) {
        ifIntroductionOne();
        ifIntroductionTwo();
        ifIntroductionThree();
    }

    private static void ifIntroductionThree() {
        int age = 21;
        if(age<16){
            System.out.println("Zapret alkohol");
        }else if (age >= 16 && age < 18){
            System.out.println(" Mozhno legkii alkohol");
        }else if (age > 18){
            System.out.println("Alkohol prodaem");
        }
    }

    private static void ifIntroductionTwo() {
        if (3>5){
            System.out.println("Pravda");
        }else {
            System.out.println("Krivda");
        }
    }

    private static void ifIntroductionOne() {
        boolean permission = false;
        boolean prohibitionDenyDe = true;
        if (false){
            System.out.println("Mozhno poekhat v letnii lager");
        }else {
            System.out.println("Na vse leto doma");
        }
    }
}
