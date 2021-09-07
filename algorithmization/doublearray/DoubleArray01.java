package by.mikhailov.algorithmization.doublearray;

/**
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

public class DoubleArray01 {
    public static void main(String[] args) {
        int[][] array = new int[5][7];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = -5 + (int) (Math.random() * 15);
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("-------------------------" );

        for (int i = 0; i < array[0].length; i+=2) {
            
            if ( array[0][i] > array[array.length-1][i]){

                for (int j = 0; j < array.length; j++)
                    System.out.printf("%3d", array[j][i]);

                System.out.println();
            }

        }
    }
}
