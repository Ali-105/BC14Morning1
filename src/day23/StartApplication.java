package day23;

import static day07.HelloBoolean.split;

public class StartApplication {
    public static void main(String[] args) {
        int decimalNumber = 99;
        String myBinaryNumber
                = Converter.DecimalToBinary(decimalNumber);
        System.out.println("Resultat raboti metoda " + decimalNumber + " v dvoichnoi sisteme:" + myBinaryNumber);
        split();
        System.out.println(Converter.BinaryToDecimal("11"));
    }
}
