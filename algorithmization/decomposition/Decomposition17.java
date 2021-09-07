package by.mikhailov.algorithmization.decomposition;

import java.util.Scanner;

/**
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
 * действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию
 */
public class Decomposition17 {
    public static void main(String[] args) {
        int number;
        number = enterNum();

        showCountOfDo(number);
    }

    public static void showCountOfDo(int number) {
        int count = 0;

        System.out.print("Число: ");
        while (number != 0) {
            number -= getSumOFDigits(number);
            System.out.print(number + " , ");
            count++;
        }

        System.out.println();
        System.out.println("Вычитаний необходимо: " + count);
    }

    public static int getSumOFDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }

        return sum;
    }

    public static int enterNum() {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Введите число");
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            System.out.println("ERROR! Введите целое число!");
            System.out.print(">>");
            scanner.next();
        }
        number = scanner.nextInt();


        return number;
    }
}
