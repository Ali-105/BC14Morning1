package day8;

public class HelloSwitch {
    public static void main(String[] args) {
        int schulNote = 5;
        System.out.println(bonus(schulNote));
    }

    public static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "Fahrrad";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "Keine Belonung";
                break;
            case 2:
                output = "Schlechte Laune";
                break;
            case 1:
                output = "Probleme";
                break;
            default:
                output = "Solche Noten exestiert nich";
                break;

        }
        return output;
    }
}
