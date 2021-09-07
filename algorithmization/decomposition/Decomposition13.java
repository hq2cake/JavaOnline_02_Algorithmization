package by.mikhailov.algorithmization.decomposition;

import java.util.Scanner;

/**
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
 * решения задачи использовать декомпозицию
 */

public class Decomposition13 {
    public static void main(String[] args) {
        int n;
        n = enterNum();
        showPairs(n);

    }

    public static void showPairs(int n){
        for (int i = n; i < (2*n) - 1; i++) {
            System.out.print("[" + i + " , " +  (i+2) + "],");
        }

    }

    public static int enterNum() {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("Введите натуральное число больше 2");
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            System.out.println("ERROR! Введите целое число!");
            System.out.print(">>");
            scanner.next();
        }
        n = scanner.nextInt();

        if(n < 3){
            System.out.println("Число меньше 3 , попробуйте еще раз");
            return enterNum();
        }

        return n;
    }


}
