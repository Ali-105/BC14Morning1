package day17.hm;

public class TernarHM {
    public static void main(String[] args) {
        //System.out.println(getMeMax(15, 5));// → 15
        //System.out.println(getMeMax(4, 16));// → 16
        //System.out.println(getMeMax(20, 100));// → 100
        //System.out.println(getMeMin(15, 45));// → 15
        //System.out.println(getMeMin(44, 16));// → 16
        //System.out.println(getMeMin(200, 100));// → 100
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        myFirstCompareTo("Kyiv", "Paris");// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"

    }

    private static String myFirstCompareTo(String citi1, String citi2) {
        String output = "";
        output = output + (citi1.charAt(0) < citi2.charAt(1) ? citi1 : citi2);
        return output;
    }

    private static int getMeMin(int a, int b) {
        int result = 0;
        result = (a< b ? a : b);

        return result;
    }

    private static int getMeMax(int a, int b) {
         return (a > b ? a : b);

    }
}
