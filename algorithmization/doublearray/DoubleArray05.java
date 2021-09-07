package by.mikhailov.algorithmization.doublearray;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 *  1  1  1  1  1  1
 *  2  2  2  2  2  0
 *  3  3  3  3  0  0
 *  4  4  4  0  0  0
 *  5  5  0  0  0  0
 *  6  0  0  0  0  0
 */

public class DoubleArray05 {
    public static void main(String[] args) {

        int n;

        n = checkNumber();

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                array[i][j] = i+1;
            }
        }

        for (int[] sArray : array) {
            for(int number: sArray) {
                System.out.printf("%3d", number);
            }
            System.out.println();
        }

    }

    public static int checkNumber() {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print(">>");
        while (true){

            while(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.print(">>");
            }
            n = scanner.nextInt();

            if (n % 2 == 0) {
                break;
            }
        }

        return n;
    }
}
