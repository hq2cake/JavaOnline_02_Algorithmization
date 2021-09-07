package by.mikhailov.algorithmization.decomposition;

/**
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

public class Decomposition16 {
    public static void main(String[] args) {
        int n = 4; // - значное число
        showSumOfOddNumber(n);
    }

    public static void showSumOfOddNumber(int n) {
        int begin;
        int end;

        begin = getBeginOfD(n);
        end = getEndOfD(n);

        for (int i = begin; i < end; i++) {
            if (checkNumber(i)) {
                System.out.print(i + " (" + " сумма цифр: " + calculateCheckedDigit(i));
                System.out.println(" ,количество четных цифр в сумме: " +
                        getCountOfEvenDigit(calculateCheckedDigit(i)) + ")");
            }
        }
    }

    public static int getCountOfEvenDigit(int sum) {
        int count = 0;

        while (sum != 0) {

            if (sum % 2 == 0) {
                count++;
            }

            sum /= 10;
        }

        return count;
    }

    public static int calculateCheckedDigit(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    public static boolean checkNumber(int number) {
        int temp;
        while (number != 0) {
            temp = number % 10;

            if (temp % 2 == 0) {
                return false;
            }

            number /= 10;
        }

        return true;
    }

    public static int getEndOfD(int n) {
        return (int) (Math.pow(10, n));
    }

    public static int getBeginOfD(int n) {
        return (int) (Math.pow(10, n - 1));
    }

}
