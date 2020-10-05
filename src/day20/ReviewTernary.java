package day20;



public class ReviewTernary {
    public static void main(String[] args) {
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// → "Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// → "Minsk"
        System.out.println(myFirstCompareTo("Киев", "Paris"));// → "Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// → "Могилёв"

        System.out.println(myFirstCompareToo("Makhachkala", "Derbent"));

    }

    private static String myFirstCompareToo(String citi1, String citi2) {
        return citi1.compareTo(citi2) < 0 ? citi1 : citi2;
    }

    private static String myFirstCompareTo(String firstWord, String secondWord) {
        String result = "";
        if (secondWord.compareTo(firstWord)> 0){
            return firstWord;
        }else {
            return secondWord;
        }




    }

}
