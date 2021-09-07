package by.mikhailov.algorithmization.doubleArray;

/**
 * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

public class DoubleArray13 {
    public static void main(String[] args) {
        int ln;
        int cl;

        ln = 10; //Количество строк в массиве
        cl = 5; //Количество столбцов в массиве

        int [][] array = new int[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 15 - 5);
            }
        }

        outPutDArr(array);

        int[][] reduceArr = reduceSortArr(array);
        outPutDArr(reduceArr);

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

    public static int[][] reduceSortArr(int[][] arr){
        int temp;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if(arr[j][i] < arr[k][i]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[j][i];
                        arr[j][i] = temp;
                    }

                }
            }
        }

        return arr;
    }

    public static int[][] ascendingSortArr (int[][] arr){
        int temp;

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    if(arr[j][i] > arr[k][i]) {
                        temp = arr[k][i];
                        arr[k][i] = arr[j][i];
                        arr[j][i] = temp;
                    }

                }
            }
        }
        return arr;
    }
}
