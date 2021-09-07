package by.mikhailov.algorithmization.doublearray;

import java.util.Scanner;

/**
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 1  2   3   n
 * n n-1 n-2 n-3
 * 1  2   3   n
 * n n-1 n-2 n-3
 * 1  2   3   n
 * n n-1 n-2 n-3
 */
public class DoubleArray04 {
    public static void main(String[] args) {
        int n;

        n = checkNumber();

        int[][] array = new int[n][n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if( i % 2 != 0) {
                    array[i-1][j-1] = j;

                } else {
                    array[i-1][j-1] = n-(j-1);
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }

            System.out.println(" ");
        }

    }

    public static int checkNumber () {
        Scanner scanner = new Scanner(System.in);

        int n;

        while (true){

            while(!scanner.hasNextInt()){
                scanner.nextLine();
                System.out.print(">>");
            }
            n = scanner.nextInt();

            if (n % 2 == 0) {
                break;
            }
        }
        return n;
    }
}
