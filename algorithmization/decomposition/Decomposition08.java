package by.mikhailov.algorithmization.decomposition;

/**
 * Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 * массива с номерами от k до m.
 */

public class Decomposition08 {
    public static void main(String[] args) {
        int k = 1;
        int m = 4;
        int[] array;

        array = createArray(10);
        showArray(array);

        checkRange(k, m, array);
    }

    public static int getSumArrayElement(int k, int m, int[] array) {
        int sum = 0;
        for (int i = k; i < m; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void checkRange(int k, int m, int[] array) {
        if (k >= 0 && m <= array.length && (m - k) == 3) {
            System.out.println("Сумма:" + getSumArrayElement(k, m, array));
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }

        System.out.println();
    }

    public static int[] createArray(int element) {
        int[] array = new int[element];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 + (int) (Math.random() * 9);
        }

        return array;
    }
}
