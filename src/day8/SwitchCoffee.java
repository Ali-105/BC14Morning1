package day8;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button = -1; // Nummer in Kafemachine
        vendigMaschine(button);

    }
    public static void kafeMilch(){
        System.out.println("Wasser kocht");
        System.out.println("Kafe kommt");
        System.out.println("Sahne kommt");
    }
    public static void vendigMaschine(int customerChoose){
        switch (customerChoose){
            case 1 :
                System.out.println("Amerikano vorbereiten");
                break;
            case 2:
                System.out.println("Wasser kocht");
                break;
            case 3:
                System.out.println("Kafe espresso vorbereiten");
                break;
            case 4:
                System.out.println("kakao vorbereiten");
                break;
            case 5:
                kafeMilch();
                break;
            default:
                System.out.println("Noch mal bitte, " +
                        "getränk nummer" + customerChoose);
        }
    }
}
