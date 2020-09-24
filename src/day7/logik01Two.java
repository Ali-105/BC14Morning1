package day7;

public class logik01Two {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true));//-> false
        System.out.println(doorbell(false, false));// -> false
        System.out.println(doorbell(true, false));// -> true
        split();
        System.out.println(verySmartDoor(true, true));// -> false
        System.out.println(verySmartDoor(false, true));// -> false
        System.out.println(verySmartDoor(true, false));// -> false
        System.out.println(verySmartDoor(false, false));// -> true



    }

    private static boolean verySmartDoor(boolean b, boolean b1) {
        return b1 | b;

    }

    private static void split() {
        System.out.println("------------");
    }

    private static boolean doorbell(boolean bellOne, boolean bellTwo) {
        return bellOne^bellTwo;
    }
}
