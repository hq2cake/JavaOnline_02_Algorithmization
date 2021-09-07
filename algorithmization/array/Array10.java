package by.mikhailov.algorithmization.array;

/**
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
 * элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */

public class Array10 {
    public static void main(String[] args) {
        int n = 20;

        int[] array = fillArray(n);

        outputArray(array,"Массив");

        int[] array2 = compressArray(array);

        outputArray(array2,"Сжатный массив");
    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] compressArray(int[] array){
        for (int i = 1; i < array.length; i+=2) {
            array[i] = 0;
        }

        return array;
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 - 3);
        }

        return array;
    }
}
