package day26;

public class ClassWork {
    public static void main(String[] args) {
        searchFor();
    }

    private static void searchFor() {
        for (int i = 0; i <20 ; i++) {
            if (i == 4){
                //break;
                continue;
            }
            System.out.println("Znachenie i :" + i);

        }
        System.out.println("Zikl zavershen");
    }
}
