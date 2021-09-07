package by.mikhailov.algorithmization.sortarray;

/**
 * Сортировка выбором.
 * Дана последовательность чисел a1<= a2<=...<= an.
 * Требуется переставить элементы так,чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент
 * и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 * повторяется. Написать алгоритм сортировки выбором.
 */

public class SortArray03 {
    public static void main(String[] args) {
        int[] array = {-12, -3, -1, 0, 2, 15, 44, 100};

        int index = 0;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {

                if (array[i] < array[j]) {
                    temp = array[j];
                    index = j;
                }

                array[index] = array[i];
                array[i] = temp;
            }
        }


        outputArray(array,"После сортировки");
    }

    public static void outputArray(int[] array, String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
        System.out.println();
    }


}
