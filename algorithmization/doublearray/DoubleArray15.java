package by.mikhailov.algorithmization.doublearray;

/**
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class DoubleArray15 {
    public static void main(String[] args) {
        int ln;
        int cl;

        ln = (int) (Math.random() * 5 + 1); //Количество строк в массиве
        cl = (int) (Math.random() * 15 + 5); //Количество столбцов в массиве

        int [][] array = new int[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 15 - 5 );
            }
        }
        outPutDArr(array);

        int maxEl;
        maxEl = findMaxElement(array);

        int[][] changedArray;
        changedArray = changeArray(array,maxEl);

        outPutDArr(changedArray);

    }
    public static int[][] changeArray(int[][] array , int number){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (array[i][j] % 2 != 0)
                    array[i][j] = number;

            }
        }

        return array;
    }

    public static int findMaxElement(int[][] array){
        int maxElement;

        maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if(maxElement < array[i][j])
                    maxElement = array[i][j];

            }
        }

        return maxElement;
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
}
