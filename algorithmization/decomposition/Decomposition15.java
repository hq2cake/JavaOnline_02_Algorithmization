package by.mikhailov.algorithmization.decomposition;

import java.util.Scanner;

/**
 *
 */

public class Decomposition15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите n от 1 до 9 >>");
        int n = readInt(scanner);
        while (n < 1 || n > 9) {
            System.out.println("Введите n от 1 до 9 >>");
            n = readInt(scanner);
        }

        int begin = (int) Math.pow(10, n - 1);
        int end = (int) (Math.pow(10, n) - 1);

        for (int i = begin; i <= end; i++) {
            if (isInc(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isInc(int n) {
        while (n > 0) {
            if (getLastDigit(n) < getLastDigit(removeLastDigit(n))) {
                return false;
            }
            n = removeLastDigit(n);
        }

        return true;
    }

    public static int getLastDigit(int n) {
        return n % 10;
    }

    public static int removeLastDigit(int n) {
        return n / 10;
    }

    public static int readInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("ERROR! Введите целое число!");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
