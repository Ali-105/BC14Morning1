package day08.hm;

public class SeasonsOfTheYear {
    public static void main(String[] args) {
        //Напишите программу, которая определяет сезон года.
               // Месяца указаны int переменными.
        int dezemberJanuarFebruar =1;
        int märzAprilMai = 2;
        int juniJuliAugust=3;
        int septemberOktoberNovember=4;

        System.out.println(what(dezemberJanuarFebruar));
        System.out.println(what(märzAprilMai));
        System.out.println(what(juniJuliAugust));
        System.out.println(what(septemberOktoberNovember));


    }
    public static String what(int season){
        String result = "";
        switch (season){
            case 1:
                result = "Winter";
                break;
            case 2:
                result = "Frühling";
                break;
            case 3:
                result="Sommer";
                break;
            case 4:
                result = "Herbst";
                break;
            default:
                result="-1";
                break;
        }


        return result;
    }
}
