package day01;

public class HomeWork {
    public static void main(String[] args) {
        // Найти площадь и периметр квадрата
        int squareSide = 15;
        square(squareSide);
        perimeter(squareSide);
    }

    public static void square(int a) {
        System.out.println("Площадь квадрата равна:" + a * a);
    }

    public static void perimeter(int a) {
        System.out.println("Периметр квадрата равен:" + 4 * a);
    }

}