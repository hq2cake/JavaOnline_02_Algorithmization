package by.mikhailov.algorithmization.doublearray;

/**
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз
 */
public class DoubleArray11 {
    public static void main(String[] args) {
        int ln;
        int cl;

        ln = 10; //Количество строк в массиве
        cl = 20; //Количество столбцов в массиве

        int[][] array = new int[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 16);
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }

        System.out.print("Строка(и) в которых число 5 встречается 3 и более раз:");

        checkElement(array);

    }

    public static void checkElement(int[][] arr) {
        int count;
        int k;

        k = 0;

        for (int i = 0; i < arr.length; i++) {
            count = 0;

            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 5) {
                    count++;
                }
            }

            if (count >= 3) {
                System.out.printf("%4d", i + 1);
                k++;
            }

        }

        if (k == 0) {
            System.out.print("  Таких строк нет ;( ");
        }

    }
}
