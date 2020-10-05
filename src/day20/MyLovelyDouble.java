package day20;

public class MyLovelyDouble {
    public static void main(String[] args) {
        double[] myDoubleArr = creatyDoubleArray();
        myPrintDoubleArray(myDoubleArr);
    }

    private static void myPrintDoubleArray(double[] input) {
        System.out.print("[");
        for (int i = 0; i <input.length-1; i++) {
            System.out.print(input[i] + ",");


        }
        System.out.println(input[input.length -1] + "]");
    }

    private static double[] creatyDoubleArray() {
        int size = (int) (Math.random() * 15);
        double[] output = new double[size];
        for (int i = 0; i < size; i++) {
            double myRandomTemp = Math.random() * 1000;
            int temp = (int) myRandomTemp;
            double end = temp;
            end = end / 100;
            output[i] = end;

        }
        return output;
    }

}

