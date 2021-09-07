package by.mikhailov.algorithmization.array;

import java.util.Scanner;

/**
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */

public class Array03 {
    public static void main(String[] args) {
        int n;
        double[] array;

        n  = Math.abs(checkNumber());

        if ( n == 0) {
            n = 1;
            System.out.println("Количество элементов в массиве должно быть больше 0");
        }

        array = fillArray(n);

        outputArray(array);
        whatElement(array);

    }

    public static void outputArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10f", array[i]);
        }
        System.out.println();
    }


    public static void whatElement(double[] array){
        int positiveElement = 0;
        int negativeElement = 0;
        int zeroElement = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0)
                negativeElement++;

            if(array[i] == 0)
                zeroElement++;

            if(array[i] > 0)
                positiveElement++;
        }

        System.out.println("Кол-во положительных элементов " + positiveElement);
        System.out.println("Кол-во отрицательных элементов " + negativeElement);
        System.out.println("Кол-во нулевых элементов " + zeroElement);
    }

    public static double[] fillArray(int n) {
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10 - 4;
        }

        return array;
    }

    public static int checkNumber() {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Введите размерность массива");
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }
        n = scanner.nextInt();

        return n;
    }
}
