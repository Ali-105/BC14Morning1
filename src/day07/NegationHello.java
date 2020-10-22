package day07;

public class NegationHello {
    public static void main(String[] args) {
        boolean redButton = false;
        String isAktiveMachine;
        System.out.println("Статус работы станка " + isAktiveMachine(redButton));
        System.out.println("Статус работы станка" + isAktiveMachine(true));
        // Если красная кнопка нажата, то её статус TRUE
        //ЕСЛИ статус кнопки TRUE,
        // то статус метода isActiveMachine должен быть false
    }

    public static boolean isAktiveMachine(boolean stopSignal) {
        return !stopSignal;
    }
}
