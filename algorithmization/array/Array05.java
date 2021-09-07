package by.mikhailov.algorithmization.array;

/**
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Array05 {
    public static void main(String[] args) {
        int n = 10;

        int[]array = fillArray(n);

        outputArray(array,"Массив");
        checkArray(array,"Элементы");

    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void checkArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i)
                System.out.print(array[i] + " ");
        }
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 5);
        }

        return array;
    }
}
