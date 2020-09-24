package day11.hm;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(leapYear(1900)); // false
        System.out.println(leapYear(2000)); // true
        System.out.println(leapYear(2020)); // true
        System.out.println(leapYear(2019)); // false
        System.out.println(leapYear(2296)); // true
        System.out.println(leapYear(1984)); // true
    }

    private static boolean leapYear(int year) {
        if (year % 400 == 0){
            return true;
        }else if (year % 400 == 0){
            return false;
        }else if (year % 4 == 0){
            return true;
        }
        return false;

    }
}
