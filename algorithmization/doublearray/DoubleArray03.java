package by.mikhailov.algorithmization.doublearray;

import java.util.Scanner;

/**
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class DoubleArray03 {
    public static void main(String[] args) {

        int[][] array = new int[5][7];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = -5 + (int) (Math.random() * 15);
                System.out.printf("%3d", array[i][j]);
            }

            System.out.println(" ");
        }

        int column;
        int row;

        row = array.length;
        column = array[0].length;

        int r = checkRowNumber(row);
        int c = checkColumnNumber(column);

        for (int i = 0; i < array[0].length; i++)
            System.out.printf("%3d", array[r-1][i]);

        System.out.println();


        for (int i = 0; i < array.length; i++)
            System.out.printf("%3d", array[i][c-1]);



    }
    public static int checkRowNumber (int row  ) {
        Scanner scanner = new Scanner(System.in);

        int k;

        while (true){

            System.out.print("Номер строки >>");
            while(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.print("Номер строки >>");
            }
            k = scanner.nextInt();

            if (k >= 1 && k <= row) {
                break;
            }
        }
        return k;
    }

    public static int checkColumnNumber (int column  ) {
        Scanner scanner = new Scanner(System.in);

        int p;

        while (true){

            System.out.print("Номер столбца >>");
            while(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.print("Номер столбца >>");
            }
            p = scanner.nextInt();

            if (p >= 1 && p <= column) {
                break;
            }
        }
        return p;
    }

}
