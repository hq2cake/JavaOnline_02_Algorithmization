package by.mikhailov.algorithmization.doublearray;

import java.util.Scanner;

/**
 * В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
 * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
 * пользователь с клавиатуры.
 */

public class DoubleArray08 {
    public static void main(String[] args) {

        int ln;
        int cl;

        ln = 3;
        cl = 10;

        int[][] array = new int[ln][cl];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 15 - 5);
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }

        int num1;
        int num2;
        while (true) {
            num1 = writeColumn("Введите номер столбца который будем менять ( отсчет начинается с 1 )", cl);
            num2 = writeColumn("Введите номер столбца с которым будем производить обмен ( отсчет начинается с 1 )", cl);

            if (num1 != num2) {
                break;
            }
        }

        changeColumn(array, num1, num2);
    }

    public static void changeColumn(int[][] array, int num1, int num2) {
        int temp;

        for (int i = 0; i < array.length; i++) {
            temp = array[i][num1 - 1];
            array[i][num1 - 1] = array[i][num2 - 1];
            array[i][num2 - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int writeColumn(String msg, int cl) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;

        boolean isTrue = true;

        while (isTrue) {
            System.out.println(msg);
            System.out.print(">>");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println(msg);
                System.out.print(">>");
            }
            num = scanner.nextInt();

            if (num <= cl && num > 0) {
                isTrue = false;
            }
        }

        return num;
    }
}
