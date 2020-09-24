package day8.hm;

public class SaleOfAlkohol {
    public static void main(String[] args) {
        //Напишите программу действий кассира магазина,
        //если у него пытаются купить алкоголь следующие 5 покупателей:
       // 10 лет, 17 лет, 18 лет, 20 лет и 30 лет.
        int buyer= 30;
        System.out.println(kaufer(buyer));
    }
    public static String kaufer(int age){
        String output = "";
        switch (age){
            case 10:
                output="Keine Alkohol";
                break;
            case 17:
                output="Auch Keine Alkohol";
                break;
            case 18:
                output="Alkohol darf man verkaufen";
                break;
            case 20:
                output="Auch darf man verkaufen";
                break;
            case 30:
             output= "Er bekommt auch Alkohol";
            break;
            default:
                output="Überhaupt keine Zigaretten";
        }


        return output;
    }
}
