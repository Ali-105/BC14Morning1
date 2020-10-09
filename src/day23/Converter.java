package day23;

public class Converter {
    public static int BinaryToDecimal(String binaryNumber){
        int decimalResult = 0;
        int power = 0;
        int binary = Integer.parseInt(binaryNumber);
        while (binary > 0){
            int remainder = binary % 10;
            decimalResult = (int) ( decimalResult + remainder * Math.pow(2,power));
            binary = binary/ 10;
            power ++;
        }



        return decimalResult;
    }



    public static String DecimalToBinary(int numberDecimal){
        String resultBinary = " ";
        int systemKooficient = 2;
        while (numberDecimal > 0){
            int remainder;
            remainder = numberDecimal % systemKooficient;
            resultBinary = remainder + resultBinary;
            numberDecimal = numberDecimal/ 2;
        }


        return resultBinary;

    }
}
