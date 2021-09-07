package by.mikhailov.algorithmization.array;

/**
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
 * чисел несколько, то определить наименьшее из них.
 */

public class Array09 {
    public static void main(String[] args) {
        int n = 20;

        int[] array = fillArray(n);

        outputArray(array,"Массив");

        findMinElement(array);
    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void findMinElement(int[] array){
        int temp;
        int count;
        int element;

        count = 0;
        element = 0;
        for (int i = 0; i < array.length; i++) {
            temp = 0;

            for (int j = i; j < array.length; j++) {
                if(array[i] == array[j]){
                    temp++;
                }
            }

            if ( count < temp ) {
                count = temp;
                element = array[i];
            }

            if(count == temp && element > array[i])
                element = array[i];

        }

        System.out.println("Наиболее часто встречающееся число:" + element);
        System.out.println("Число встречается:" + count + " раз(а)");
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 3);
        }

        return array;
    }
}
