package day06;

public class HelloString2 {
    public static void main(String[] args) {
        String poema = " Прощай не мытая россия";
        int dlina = poema.length();// рассчитать длину текста "String poema"
        System.out.println(dlina);
        String perview = poema.substring(0, 10); // показать длину текста с 0 до 10
        System.out.println(perview + "...");
        String endPoema = poema.substring(dlina -10); // показать 10 символов с конца
        System.out.println(endPoema);
        char test = poema.charAt(4);
        System.out.println(test);
        char test1 = poema.charAt(dlina -1);// вызов 23 символа
        System.out.println(test1);

        String vasya = "Vasilii";
        int dlina1 = vasya.length();
        System.out.println(dlina1);
        String pokazatDlinu = vasya.substring(0, 1).toUpperCase() + vasya.substring(1);
        System.out.println(pokazatDlinu);
    }
}
