package by.mikhailov.algorithmization.array;

/**
 * Дана последовательность целых чисел  a1 , a2 ,..., an.
 * Образовать новую последовательность выбросив из исходной те члены
 * которые равны min(a1 , a2 ,..., an).
 */
public class Array08 {
    public static void main(String[] args) {
        int n = 20;
        int minEl;
        int count;

        int[] array = fillArray(n);

        outputArray(array,"Массив: ");

        minEl = findMinElement(array)[0];
        count = findMinElement(array)[1];

        System.out.println(minEl);
        System.out.println(count);

        int[] array2 = removeMinElementAndCreateNewArray(array,minEl,count);

        outputArray(array2,"Новый массив: ");
    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeMinElementAndCreateNewArray(int[] array , int minEl , int count){
        int[] newArray = new int[array.length - count];
        int j;

        j = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != minEl) {
                newArray[j] = array[i];
                j++;
            }
        }

        return newArray;
    }

    public static int[] findMinElement(int[] array){
        int[] data = new int[2];

        data[0] = array[0];
        for (int i = 0; i < array.length; i++) {

            if(data[0] > array[i])
                data[0] = array[i];

        }

        for (int i = 0; i < array.length; i++) {

            if(data[0] == array[i])
                data[1]++;

        }


        return data;
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 5);
        }

        return array;
    }
}
