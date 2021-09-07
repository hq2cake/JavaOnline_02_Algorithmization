package by.mikhailov.algorithmization.doublearray;

/**
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 * единиц равно номеру столбца.
 */

public class DoubleArray14 {
    public static void main(String[] args) {
        int m;
        int n;

        m = (int) (Math.random() * 5 + 3); //Количество строк в массиве
        n = (int) (Math.random() * 10 + 3); //Количество столбцов в массиве

        int[][] array = createArr(m,n);
        outPutDArr(array);

        int[][] sortArray = isCounterNum(array);
        outPutDArr(sortArray);

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

    public static int[][] createArr(int m , int n){
        int [][] array = new int[m][n];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }
        }

        return array;
    }

    public static int[][] isCounterNum(int[][] array ) {

        for (int j = 0; j < array[0].length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {


                if (count == j)
                    array[i][j] = 0;

                if (count < j)
                    array[i][j] = 1;

                if (count > j)
                    array[i][j] = 0;


                if (array[i][j] == 1)
                    count++;


            }
        }

        return array;
    }
}
