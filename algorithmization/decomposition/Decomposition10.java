package by.mikhailov.algorithmization.decomposition;

/**
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
 * являются цифры числа N.
 */

public class Decomposition10 {
    public static void main(String[] args) {
        int n = 335789376;
        int[] array;

        array = createArray(n);

        showArray(array);
    }
    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }

        System.out.println();
    }

    public static int[] createArray(int n) {
        int countElement;
        countElement = getCountOfDigit(n);

        int[]array = new int[countElement];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = n % 10;
            n /= 10;
        }

        return array;
    }

    public static int getCountOfDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}
