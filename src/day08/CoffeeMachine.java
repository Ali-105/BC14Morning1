package day08;

public class CoffeeMachine {
    public static void latte(){
        System.out.println("------");
        System.out.println("We are created latte for you");
        milk(40);
        coffe(30);
        watter(70);
        System.out.println("------");
    }

    private static void coffe(int ml) {
        System.out.printf("Added %d ml af coffe \n", ml);
    }

    private static void milk(int ml) {
        System.out.printf("Added %d ml of milk \n",ml);
    }

    private static void watter(int ml){
        System.out.printf("Added %d ml of watter\n", ml);
    }
    public static void cappuccino(){
        System.out.println("-----");
        System.out.println("We are created cappuccino for you");
        milk(30);
        coffe(40);
        watter(20);
        System.out.println("------");
    }
    public static void espresso(){
        //milk
        System.out.println("We are created espresso for you");
        coffe(60);
        watter(40);
        System.out.println("-------");

    }

}
