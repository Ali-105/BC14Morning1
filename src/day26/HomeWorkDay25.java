package day26;

public class HomeWorkDay25 {
    public static void main(String[] args) {
        toCharArray();
        String test = "Vasilii";
        printCharArray(toCharArray());
    }

    private static void printCharArray(char [] arr) {
        for (char element:arr) {
            System.out.print(element + " ");

        }
    }

    private static char[] toCharArray() {
        String hausMeister = "Vasilii";
        char[] myNewArray = hausMeister.toCharArray();
        return myNewArray;
    }
}
