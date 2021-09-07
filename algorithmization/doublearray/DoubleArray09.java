package by.mikhailov.algorithmization.doublearray;

/**
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму.
 */

public class DoubleArray09 {
    public static void main(String[] args) {
        int ln;
        int cl;

        ln = 3; //Количество строк в массиве
        cl = 10; //Количество столбцов в массиве

        double[][] array = new double[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = Math.random() * 10;
                System.out.printf( "%11f" ,array[i][j]);
            }
            System.out.println();
        }

        double[] arr1 = sumOfElement(array);

        for(double num: arr1){
            System.out.printf( "%11f" , num);
        }

        System.out.println(" ");

        findMaxSum(arr1);
    }
    public static void findMaxSum(double[] arr1) {
        double maxSum;
        int index;

        index = 0;
        maxSum = arr1[0];

        for (int i = 1; i < arr1.length; i++) {
            if(maxSum < arr1[i]){
                maxSum = arr1[i];
                index = i+1;
            }
        }

        System.out.println("Столбец под номером < " + index + " > содержит максимальную сумму " + maxSum);
    }

    public static double[] sumOfElement (double[][] array){

        double[] sumOfElementArray = new double[array[0].length];

        double sum;
        for (int i = 0; i < array[0].length; i++) {
            sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sumOfElementArray[i] = sum;
        }

        return sumOfElementArray;
    }
}
