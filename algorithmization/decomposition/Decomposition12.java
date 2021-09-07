package by.mikhailov.algorithmization.decomposition;

/**
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Decomposition12 {
    public static void main(String[] args) {
        int k = 24;
        int n = 7;
        int[] a;

        a = createArray(n, k);
        showArray(a);
        System.out.println("ВЫПОЛНЕНО");
    }

    public static void showArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " , ");
        }
        System.out.println(a[a.length - 1] + ".");
    }

    public static int[] createArray(int n, int k) {
        int count = 0;
        int[] a = new int[10]; // Необходимое количество элементов в массиве

        while (count != a.length) {
            a[count] = findNumber(n, k);
            count++;
        }

        return a;
    }

    public static int findNumber(int n, int k) {
        int number = 0;
        int sum = 0;

        while (sum != k) {
            number = (int) (Math.random() * 2147483647);
            sum = sumOfDigit(number, n, k);
        }

        return number;
    }

    public static int sumOfDigit(int num, int n, int k) {
        int sum = 0;
        int temp = 0;

        while (num != 0) {
            temp = num % 10;
            //System.out.println(temp);
            if (temp > n) {
                return 0;
            }

            sum += temp;
            //System.out.println(sum);
            if (sum > k) {
                return 0;
            }

            num /= 10;
        }

        return sum;
    }
}
