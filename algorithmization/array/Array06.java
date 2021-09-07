package by.mikhailov.algorithmization.array;

/**
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
 * являются простыми числами.
 */

public class Array06 {
    public static void main(String[] args) {
        int n = 20;
        int sum;

        int[]array = fillArray(n);

        outputArray(array,"Массив:");

        sum = sumOfSimpleNumber(array);
        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами:" + sum);

    }

    public static void outputArray(int[] array,String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int sumOfSimpleNumber(int[] array){
        int sum = 0;
        int count;

        for (int i = 0; i < array.length; i++) {
            count = 0;

            for (int j = 1; j <= i; j++) {
                if(i % j == 0)
                    count++;
            }

            if(count == 2)
                sum += array[i];

        }

        return sum;
    }

    public static int[] fillArray(int n) {
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 5);
        }

        return array;
    }
}
