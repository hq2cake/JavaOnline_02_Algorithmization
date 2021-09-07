package by.mikhailov.algorithmization.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел:
 * НОК(А,В) = (А * В) / НОД(А, В)
 */

public class Decomposition01 {
    public static void main(String[] args) {
        System.out.println(NOK(30, 18));
    }

    public static int NOK(int a, int b) {
        return a * b / NOD(a, b);
    }

    public static int NOD(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        return (a + b);
    }
}
