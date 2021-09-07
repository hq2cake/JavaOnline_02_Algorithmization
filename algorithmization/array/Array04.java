package by.mikhailov.algorithmization.array;

/**
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */

public class Array04 {
    public static void main(String[] args) {
        int maxEl;
        int minEl;
        int n = 5;

        double[] array = fillArray(n);

        outputArray(array);

        maxEl = searchMaxElement(array);
        minEl = searchMinElement(array);

        double temp;

        temp = array[minEl];
        array[minEl] = array[maxEl];
        array[maxEl] = temp;

        outputArray(array);

    }
    public static void outputArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%10f", array[i]);
        }
        System.out.println();
    }

    public static int searchMinElement(double[] array){
        int indexMinElement = 0;
        double temp;

        temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(temp > array[i]) {
                temp = array[i];
                indexMinElement = i;
            }
        }

        return indexMinElement;
    }

    public static int searchMaxElement(double[] array){
        int indexMaxElement = 0;
        double temp;

        temp = array[0];
        for (int i = 0; i < array.length; i++) {
            if(temp < array[i]) {
                temp = array[i];
                indexMaxElement = i;
            }
        }

        return indexMaxElement;
    }

    public static double[] fillArray(int n) {
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 10 - 4;
        }

        return array;
    }
}
