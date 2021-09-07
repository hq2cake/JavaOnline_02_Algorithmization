package by.mikhailov.algorithmization.doublearray;

/**
 * Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class DoubleArray10 {
    public static void main(String[] args) {
        int n;

        n = 5;
        double[][] array = new double[n][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (Math.random() * 10 - 5);
                System.out.printf( "%11f" ,array[i][j]);
            }
            System.out.println();
        }

        System.out.println("=============================================================");
        positiveElement(array);
    }

    public static void positiveElement(double[][] arr){
        double[] positiveArray = new double[arr[0].length];
        int j;

        j = 0;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i][i] > 0 ) {
                    positiveArray[j] = arr[i][i];
                    j++;
            }
        }

        if ( j == 0 ) {
            System.out.println("Положительных элеметов на главной матрице нет");
        } else {

            for(double num : positiveArray){
                System.out.printf( "%11f" ,num);
            }

        }

    }
}
