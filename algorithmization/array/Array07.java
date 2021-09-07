package by.mikhailov.algorithmization.array;

/**
 * Даны действительные числа a1,a2,.....an . Найти
 * max(a1 + a2n, a2 + a2n-1, ..... , an + an+1)
 */

public class Array07 {
    public static void main(String[] args) {
        int n = 9;
        double maxSum;

        double[] array = fillArray(n);

        outputArray(array,"Массив:");

        maxSum = getMaxSum(array);

        System.out.println("Максимальная сумма:" + maxSum);

    }

    public static void outputArray(double[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ; ");
        }
        System.out.println();
    }

    public static double getMaxSum(double[] array) {
        double maxSum;
        maxSum = array[0] + array[array.length - 1];

        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }

    public static double[] fillArray(int n) {
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 5);
        }

        return array;
    }
}
