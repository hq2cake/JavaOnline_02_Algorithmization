package by.mikhailov.algorithmization.doublearray;

/**
 * Сформировать квадратную матрицу порядка N по правилу:
 * A[I,J] = sin((I^2 - J^2) /N)
 * и подсчитать количество положительных элементов в ней.
 */

public class DoubleArray07 {
    public static void main(String[] args) {
        int n;
        int numberOfPositive;

        n = 7;
        numberOfPositive = 0;

        double[][] array = new double[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                array[i][j] = Math.sin((i * i - j * j) / (double) n);
                if (array[i][j] > 0){
                    numberOfPositive++;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length ; j++) {
                System.out.printf("%10f", array[i][j]);
            }
            System.out.println();
        }

        System.out.println("Количество положительных элементов: " + numberOfPositive);
    }
}
