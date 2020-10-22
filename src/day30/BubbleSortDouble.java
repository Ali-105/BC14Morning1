package day30;

import java.util.Arrays;

public class BubbleSortDouble {
    public static void main(String[] args) {
        double[] myLovelyDouble = new double[] {3.1, 6.18, 18.0, 1.0, 0.5, 100.0};
        System.out.println(Arrays.toString(myLovelyDouble));
        double[] newArray = copyArray(myLovelyDouble);
        bubbleSortTwo(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortTwo(double[] arrUnsorted) {
        int count = 0;
        for (int i = 0; i <arrUnsorted.length -1 ; i++) {
            if (arrUnsorted[i] < arrUnsorted[i +1]){
                continue;
            }
            double temp = arrUnsorted[i];
            arrUnsorted[i] = arrUnsorted[i +1];
            arrUnsorted[i +1] = temp;
            count++;

        }
        if (count>0){
            bubbleSortTwo(arrUnsorted);
        }
    }

     private static void bubbleSort(double[] unsortedArr) {
          boolean unsort = true;
          while (unsort){
              unsort= false;
              for (int i = 0; i <unsortedArr.length -1; i++) {
                  if (unsortedArr[i] > unsortedArr[i +1]){
                      double temp = unsortedArr[i];
                      unsortedArr[i] = unsortedArr[i+1];
                      unsortedArr[i +1] = temp;
                      unsort = true;
                  }

              }
          }
      }

    private static double[] copyArray(double[] input) {
        double[] newDoubleArray = new double[input.length];
        for (int i = 0; i <input.length ; i++) {
            newDoubleArray[i] = input[i];

        }
        return newDoubleArray;
    }

}
