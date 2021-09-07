package by.mikhailov.algorithmization.decomposition;

import java.util.Scanner;

/**
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 */

public class Decomposition06 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        num1 = enterNum();
        num2 = enterNum();
        num3 = enterNum();

        NOD3(num1,num2,num3);

    }
    public static int enterNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        System.out.print(">>");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print(">>");
        }

        return Math.abs(scanner.nextInt());
    }
    public static void NOD3 (int num1 , int num2 , int num3){
        int result;
        result = NOD(num1,NOD(num2,num3));

        if(result == 1){
            System.out.println("Числа:" + num1+ "," + num2+ "," + num3 + " являются взаимнопростыми");
        } else {
            System.out.println("Числа:" + num1+ "," + num2+ "," + num3 + " не являются взаимнопростыми");
        }
    }

    public static int NOD(int num1 , int num2) {

        while (num1 != 0 && num2 != 0) {
            if(num1 > num2){
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }

        return num1 + num2;
    }
}
