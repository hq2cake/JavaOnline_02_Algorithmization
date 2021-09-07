package by.mikhailov.algorithmization.doubleArray;

/**
 * Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class DoubleArray12 {
    public static void main(String[] args) {
        int ln;
        int cl;

        ln = 4; //Количество строк в массиве
        cl = 15; //Количество столбцов в массиве

        int [][] array = new int[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 15 - 5);
            }
        }

        outPutDArr(array);

        int[][] reduceArray = reduceSortArr(array);
        outPutDArr(reduceArray);

        int[][] ascendingArr = ascendingSortArr(array);
        outPutDArr(ascendingArr);

    }

    public static void outPutDArr(int arr[][]) {
        System.out.println();

        for(int[] sArr:arr){
            for(int num : sArr){
                System.out.printf( "%4d" ,num);
            }
            System.out.println();
        }
    }

    public static int[][] reduceSortArr (int[][] arr){
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = j+1; k < arr[0].length; k++) {

                    if(arr[i][j] < arr[i][k]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = temp;
                    }

                }
            }
        }

        return arr;
    }

    public static int[][] ascendingSortArr (int[][] arr){
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                for (int k = j+1; k < arr[0].length; k++) {

                    if(arr[i][j] > arr[i][k]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][j];
                        arr[i][j] = temp;
                    }

                }
            }
        }

        return arr;
    }

}
