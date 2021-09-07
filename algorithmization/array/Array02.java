package by.mikhailov.algorithmization.array;

import java.util.Scanner;

/**
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 */

public class Array02 {
    public static void main(String[] args) {
        int n;
        int z;
        int[] array;

        n = 50;
        z = Math.abs(checkNumber());
        array = fillArray(n);

        outputArray(array);
        replacementNumber(array,z);
        outputArray(array);

    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }

    public static void replacementNumber(int[] arr, int z) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z ) {
                arr[i] = z;
                sum++;
            }
        }
        System.out.println("Количество замен=" +sum);
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 99 + 1);
        }

        return array;
    }

    public static int checkNumber() {
        Scanner scanner = new Scanner(System.in);

        int z;

        System.out.println("Введите целое число");
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        z = scanner.nextInt();

        return z;
    }

}
