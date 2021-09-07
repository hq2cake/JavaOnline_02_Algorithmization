package by.mikhailov.algorithmization.sortarray;

/**
 * Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm
 * Образовать из них новую последовательность чисел так, что бы она тоже была неубывающей.
 */

public class SortArray02 {
    public static void main(String[] args) {

        int [] array1 = {-12,-5,3,6,12};
        int [] array2 = {-11,-5,1,4,12,12,14,17};

        int[] array3 = addArrayToArray(array1,array2);

        outputArray(array3,"Новая последовательность:");
    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
        System.out.println();
    }

    public static int[] addArrayToArray(int[] arr1 , int[] arr2 ){
        int lenArr1;
        int lenArr2;
        int lenArr3;

        lenArr1 = arr1.length;
        lenArr2 = arr2.length;
        lenArr3 = lenArr1 + lenArr2;

        int[] arr3 = new int[lenArr3];

        int j = 0;
        for (int i = 0; i < arr3.length; i++) {

            if (i < lenArr1 && i < lenArr2) {
                if (arr1[i] <= arr2[i]) {
                        arr3[j] = arr1[i];
                        arr3[j + 1] = arr2[i];
                        j++;
                } else {
                        arr3[j] = arr2[i];
                        arr3[j + 1] = arr1[i];
                        j++;
                }

                j++;

            }

            if(i >= lenArr1 && i < lenArr2) {
                arr3[j] = arr2[i];
                j++;
            }

            if(i >= lenArr2 && i < lenArr1) {
                arr3[j] = arr1[i];
                j++;
            }



        }

        return arr3;
    }
}
