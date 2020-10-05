package day18;

public class ColorPrint {
    public static void main(String[] args) {
        myColorPrintfIntroTwo();
    }

    private static void myColorPrintfIntroTwo() {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        System.out.println(ANSI_RED + "This text is red!" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Bukva" + ANSI_RESET);

        final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
        final String  ANSI_RED_BACKGROUND = "\u001B[41m";
        final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_BLUE_BACKGROUND = "\u001B[44";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46";
        final String ANSI_WHITE_BACKGROUND = "\u001B[47";


        System.out.println(ANSI_PURPLE_BACKGROUND + " This text has a purple buckground but default text!" + ANSI_RESET);
        System.out.println(ANSI_RED + "This text has red text but a default background!" + ANSI_RESET);
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_RED+ "This text has a purple background and red text!" + ANSI_RESET);
        System.out.println(ANSI_BLUE + ANSI_PURPLE_BACKGROUND + "ICHKL SKNL LDJKDMM" + ANSI_RESET);



    }
}
