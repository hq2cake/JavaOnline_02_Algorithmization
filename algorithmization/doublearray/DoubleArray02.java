package by.mikhailov.algorithmization.doublearray;

/**
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class DoubleArray02 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = -5 + (int) (Math.random() * 15);
                System.out.printf("%3d", array[i][j]);
            }

            System.out.println(" ");
        }
        System.out.println("================");
        fromLeftToRight(array);
        fromRightToLeft(array);
    }

    public static void fromLeftToRight (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i][i]);
        }
    }

    public static void fromRightToLeft (int[][] array) {
        System.out.println(" ");

        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%3d", array[i][array.length - 1 - i ]);
        }
    }
}
