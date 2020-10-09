package day23;

import static day07.HelloBoolean.split;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //month();
        split();
        //simpleTable();
        split();
        //anotherArray();
        split();
        //arrayFor();
        split();
        arrayFive();
    }

    private static void arrayFive() {
        int[][] example = {
                {1},
                {2, 2},
                {3, 3, 3},
                {4, 4, 4,4},
                {5, 5, 5, 5, 5}

        };
        for (int [] element : example) {
            for ( int elementik : element) {
                System.out.print(elementik + "  ");

            }
            System.out.println();

        }
    }

    private static void arrayFor() {
        int[][] a1 = new int [5][];
        a1[0] = new int [1];
        a1[1] = new int[54];
        a1[2] = new int[23];
        a1[3] = new int[2];
        a1[4] = new int[21];
        for (int[] element : a1) {
            for (int elementik : element) {
                System.out.print(elementik + " ");

            }
            System.out.println();

        }
    }

    private static void anotherArray() {
        int[][][] a1 = new int[3][4][5];
        byte[][][] byteArray = {
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7,8 ,},

                },
                {
                        {0, 1, 2},
                        {3, 4, 5},
                        {6, 7, 8},
                },
                {
                        {4, 5, 7},
                        {3, 4, 6},
                        {8, 9, 1},
                }

        };
    }

    private static void simpleTable() {
        String[][] myArray = new String[3][3];

        myArray[0][0] = "1";
        myArray[0][1] = "Kurbanov";
        myArray[0][2] = "N° 23456";

        myArray[1][0] = "2";
        myArray[1][1] = "Ronaldo";
        myArray[1][2] = "N° 3774904";

        myArray[2][0] = "3";
        myArray[2][1] = "Messi";
        myArray[2][2] = "N° 3893003";
        printTwoDStringArray(myArray);

    }

    public static void printTwoDStringArray(String[][] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                System.out.println(input[i][j] + " ");

            }
            System.out.println();

        }
    }

    private static void month() {
        int[][] monthCalendar = new int[4][7];

        for (int outer = 0; outer < monthCalendar.length; outer++) {
            for (int inner = 0; inner < monthCalendar[outer].length; inner++) {
                monthCalendar[outer][inner] = outer * 7 + inner + 1;
                System.out.print(monthCalendar[outer][inner] + " ");

            }
            System.out.println();

        }
    }
}
