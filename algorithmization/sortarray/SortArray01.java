package by.mikhailov.algorithmization.sortarray;

import java.util.Scanner;

/**
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 * Объединить их в один массив, включив второй между k-м и k+1-м элементами первого,
 * при этом не используя дополнительный массив
 */

public class SortArray01 {
    public static void main(String[] args) {
        int k;

        int[] array1 = fillArray();
        int[] array2 = fillArray();

        int arrayLength;
        arrayLength = array1.length;

        k = printNum(arrayLength);
        System.out.println(k);

        outputArray(array1,"Массив 1:");
        outputArray(array2,"Массив 2:");

        int[] array3;
        array3 = concatenationArray(array1,array2,k);

        outputArray(array3,"Массив 3:");
    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }

    public static  int[] concatenationArray(int[]arr1 , int[]arr2 , int k){
        int size;
        int j;

        size = arr1.length + arr2.length;

        int[] arr3 = new int[size];

        j = 0;

        for (int i = 0; i < k+1; i++) {
            arr3[j] = arr1[i];
            j++;
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[j] = arr2[i];
            j++;
        }

        for (int i = k+1; i < arr1.length; i++) {
            arr3[j] = arr1[i];
            j++;
        }

        return arr3;
    }

    public static int printNum(int len){
        Scanner scanner = new Scanner(System.in);
        int k;

        System.out.println("Введите номер элемента после которого вы хотите вставить второй массив");
        System.out.println("От [0 до " + (len - 2) + ")" );
        System.out.print(">>");
        while (!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.print(">>");
        }
        k = scanner.nextInt();

        if (k >= len ){
            return printNum(len);
        }

        return k;
    }

    public static int[] fillArray() {
        int count;
        count = (int) (Math.random() * 10 + 4);

        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 3);
        }

        return array;
    }
}
