package by.mikhailov.algorithmization.decomposition;

/**
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */

public class Decomposition07 {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9: " + sumOfFactorial());
    }

    public static int fact(int f){
        int num = 1;
        for (int i = 1; i <= f; i++) {
            num*=i;
        }
        return num;
    }

    public static long sumOfFactorial(){
        int sum = 1;
        for (int i = 1; i <= 9; i+=2) {
            sum += fact(i);
        }
        return sum;
    }
}
