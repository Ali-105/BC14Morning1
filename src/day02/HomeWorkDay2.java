package day02;

public class HomeWorkDay2<statik> {
    public static void main(String[] args) {
        // 1 . Найти площадь и периметр квадрата
        // 2 . Найти площадь и периметр прямоугольника
        // 3 . Найти площадь и периметр куба
        int firstSide = 10;
        int secondSide = 20;
        findRectangleSquare(firstSide, secondSide);
        findRectanglePerimeter(firstSide, secondSide);
        int cubeSide = 5;
        findeCubeSquare(cubeSide);
        findeCubePerimeter(cubeSide);
    }

    public static void findeCubePerimeter(int a){
        System.out.println(" Периметр куба" + (12* a));
    }

    private static void findeCubeSquare(int a) {
        System.out.println(" Площадь куба" + (a * a) * 6);

    }

    public static void findRectangleSquare(int a, int b) {
        System.out.println("Площадь прямоуг" + (a * b ));

    }

    public static void findRectanglePerimeter(int a, int b){
        System.out.println("Периметр прямоуг" + (a * b) * 2);
    }
    }
