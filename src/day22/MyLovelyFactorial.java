package day22;

public class MyLovelyFactorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(7));
        System.out.println(getFactorial(5));
        //!100 = !99 * 100;
        // !10 = !9 * 10;
        //!5 = !4 * 5;
        System.out.println(getFactorialRecursion(7));
        System.out.println(getFactorialRecursion(5));
    }

    private static int getFactorialRecursion(int number) {
        if (number < 1){
            return 1;
        }else{
            return number * getFactorialRecursion(number - 1);
        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            //result = result* i;
            result *= i;

        }
        return result;

    }
}
