package day16;

public class ClassWork {
    public static void main(String[] args) {
       /* System.out.println(shareDigit(12, 23));// → true
        System.out.println(shareDigit(12, 43)); //→ false
        System.out.println(shareDigit(12, 44));// → false*/
        System.out.println(squirrelPlay(70, false));// → true
        System.out.println(squirrelPlay(95, false));// → false
        System.out.println(squirrelPlay(95, true));// → true
       /* System.out.println(alarmClock(1, false));// → "7:00"
        System.out.println(alarmClock(5, false));// → "7:00"
        System.out.println(alarmClock(0, false));// → "10:00"
*/
        /*System.out.println(less20(18));// → true
        System.out.println(less20(19));// → true
        System.out.println(less20(20));// → false*/
        System.out.println(answerCell(false, false, false));// → true
        System.out.println(answerCell(false, false, true));// → false
        System.out.println(answerCell(true, false, false));// → false



    }

    private static boolean answerCell(boolean morning, boolean mama, boolean asleep) {
        if (asleep){
            return false;
        }else if (morning && !mama){
            return false;
        }
        return true;
    }

    private static boolean less20(int a) {
        if (a % 20 == 18 || a % 20 == 19){
            return true;
        }else {
            return false;
        }

    }

    private static boolean specialEleven(int a) {
        if (a % 11 == 0 || a % 11 == 1) {
            return true;
        } else {

            return false;
        }
    }

        private static String alarmClock ( int weekdays, boolean vacation){
            String alarm = "";
            if (vacation && (weekdays <= 6 && weekdays >= 0)) {
                alarm = "off";
            } else if (weekdays == 6 || weekdays == 0 || vacation) {
                alarm = "10:00";
            } else {
                alarm = "7:00";
            }
            return alarm;
        }


    private static boolean squirrelPlay(int temperatur, boolean summer) {
        if (temperatur > 60 && temperatur <= 90) {
            return true;
        } else if (summer && temperatur <= 100) {
            return true;
        } else {
            return false;
        }
    }


    private static boolean shareDigit(int a, int b) {
        int a1 = a / 10;
        int a2 = a % 10;
        int b1 = b / 10;
        int b2 = b % 10;
        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
            return true;
        } else {
            return false;
        }
    }
}

