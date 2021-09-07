package by.mikhailov.algorithmization.array;

import java.util.Scanner;

/**
 *  В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

public class Array01 {
    public static void main(String[] args) {
        int n;
        int k;
        int[] array;

        n = 10;
        k = Math.abs(checkNumber());
        array = fillArray(n);

        outputArray(array);
        System.out.println();
        sumOfArrayMultipleOfK(array, k);

    }

    public static void outputArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }
    }

    public static void sumOfArrayMultipleOfK(int[] arr, int k) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма элементов массива кратных k=" + k + " равна  " + sum);
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

        int k;

        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        k = scanner.nextInt();

        return k;
    }

}
