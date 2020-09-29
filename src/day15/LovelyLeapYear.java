package day15;

public class LovelyLeapYear {
    public static void main(String[] args) {
        printLeapYears(2000, 2009);
        countLeapYears(1900, 2009);
    }

    private static void countLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = year1; i <= year2 ; i++) {
            if (checkLeapYear(i)){
                count++;
            }

        }
        System.out.println("Zwischen Jharen" + year1 + "und"
        + year2 + "insgesamt" + count + "visikisnich year");
    }

    private static void printLeapYears(int year1, int year2) {
        for (int i = year1; i < year2; i++) {
            if (checkLeapYear(i)) {
                System.out.println(i);
            }

        }
    }

    public static boolean checkLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 ^ year % 100 == 0;
    }
}