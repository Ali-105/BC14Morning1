package day25;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));//     ""
    }

    private static String getSandwich(String str) {
         int indexStart = 0;
         String result = "";
         String bread = "bread";
         indexStart = str.indexOf(bread);
         int indexEnd = str.lastIndexOf(bread);
         if (indexEnd != indexStart){
             result = str.substring( indexStart + bread.length(),indexEnd);
         }
         return result;
    }
}
