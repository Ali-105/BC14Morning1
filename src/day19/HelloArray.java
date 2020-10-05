package day19;

public class HelloArray {
    public static void main(String[] args) {
        //helloMyFirstArray();
        //oldDeclaration();
        //arrayInitialisation();
        //germanCities();
        intArrayGame();

    }

    private static void intArrayGame() {
        int[] field = new int[]{5, 15, 3, 67, 90};
        int[] testArray = new int[]{67, 90};// [67, 90]
        System.out.println(field[3]);
        System.out.println("[" + field[3] + "," + field[4] + "]");
    }

    private static void germanCities() {
        String[] germanCity = new String[]{"Berlin", "München" , "Dresden", "Frankfurt" , "Hamburg"};
        int size = germanCity.length;
        System.out.println("Kolichestvo elementov v massive nemezkich gorodov" + size);
        int countLetter = 0;
        for (int i = 0; i < size; i++) {
            countLetter= countLetter + germanCity[i].length();
            System.out.println("Kolichestvo vsech Bukv" + countLetter);

        }

    }

    private static void arrayInitialisation() {
        int[] field;
        field = new int[10];// v massive 10 yacheek

        String[] fourSeasons = new String[]{"Vivaldi", "Tchaikovski", "Astor Piazolla", "Stephen Edwin"};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Leipzig"};
    }

    private static void oldDeclaration() {
        // dataType arrayName[];
        int myArray[];
        String users[];
        long variable = 345423651;
    }

    private static void helloMyFirstArray() {
        int[] myFirstArray;

        // dataType[] arrayName;
        String[] myFirstArrayString;
        double[] gpsPoints;
        boolean[] permission;
        char[] symbols[];
    }
}
