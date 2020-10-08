package day22;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        split();
        System.out.println(bunnyEars2 (0));// → 0
        System.out.println(bunnyEars2(1));// → 2
        System.out.println(bunnyEars2(2));// → 5
        split();
        System.out.println(count7(717));// → 2
        System.out.println(count7(17));// → 1
        System.out.println(count7(123));// → 0


    }

    private static int count7(int number) {
        if (number == 0){
            return 0;
        }else if (number%10 == 7){
            return 1 + count7(number/10);
        }else {
            return count7(number/10);
        }
    }

    private static void split() {
        System.out.println("______");
    }

    private static int bunnyEars2(int rabbit) {
        if ( rabbit == 0){
            return 0;
        }else if (rabbit == 1){
            return 2;
        }else if (rabbit == 2){
            return 5;
        }
        return 5 + bunnyEars2(rabbit - 2);
    }

    private static int factorial(int input) {
        if (input == 1){
            return 1;
        }else if (input == 2){
            return 2;
        }
        return (factorial(input -1) + factorial(input -2));


    }
}
