package by.mikhailov.algorithmization.doublearray;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1 1 1 1 1 1
 * 0 1 1 1 1 0
 * 0 0 1 1 0 0
 * 0 1 1 1 1 0
 * 1 1 1 1 1 1
 */

public class DoubleArray06 {
    public static void main(String[] args) {
        int n;

        n = 6;

        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                for (int j = i; j < n - i; j++) {
                    array[i][j] = 1;
                }

            } else {
                for (int j = 0; j < n; j++) {
                    array[i][j] = array[n - 1 - i][j];
                }
            }
        }

        for (int[] sArray : array) {
            for(int number: sArray) {
                System.out.printf("%3d", number);
            }
            System.out.println();
        }
    }
}
