package by.mikhailov.algorithmization.decomposition;

/**
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 * использовать декомпозицию.
 */

public class Decomposition14 {
    public static void main(String[] args) {
        int k = 100000;
        showAllArmstrongNumb(k);
    }

    public static void showAllArmstrongNumb(int k) {

        System.out.print("Числа Армстронга: ");
        for (int i = 1; i < k; i++) {
            if (getSumOfNumber(i, getLengthOfNumber(i)) == i) {
                System.out.print(i + " , ");
            }
        }
    }

    public static int getSumOfNumber(int number, int k) {
        int sum = 0;

        while (number != 0) {
            sum += Math.pow((number % 10), k);
            number /= 10;
        }

        return sum;
    }

    public static int getLengthOfNumber(int num) {
        int digit = 0;
        while (num != 0) {
            digit++;
            num /= 10;
        }

        return digit;
    }


}
