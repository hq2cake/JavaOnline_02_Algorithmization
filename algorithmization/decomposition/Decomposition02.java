package by.mikhailov.algorithmization.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел
 */

public class Decomposition02 {
    public static void main(String[] args) {
        System.out.println(NOD4(120,180,40,50));

    }
    public static int NOD4(int a, int b, int c, int d){
        return NOD(a,NOD(b,NOD(c,d)));
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
