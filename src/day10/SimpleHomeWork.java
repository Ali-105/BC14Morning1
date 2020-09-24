package day10;

public class SimpleHomeWork {
    public static void main(String[] args) {
        findPrimeNumber(2,43);
        //System.out.println(checkPrime(20));//(false
        //System.out.println(checkPrime(2));//true
    }

    private static void findPrimeNumber(int a, int b) {
        for (int i = a; i < b ; i++) {
            if(checkPrime(i)){
                System.out.println(i + "");
            }

        }
    }

    private static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }

}
