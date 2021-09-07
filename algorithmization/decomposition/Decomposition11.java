package by.mikhailov.algorithmization.decomposition;

/**
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
 */

public class Decomposition11 {
    public static void main(String[] args) {
        int num1 = 14125235;
        int num2 = 141456;

        showMaxCountOfElement(num1,num2);
    }
    public static void showMaxCountOfElement(int num1 , int num2){
        int count1;
        int count2;


        count1 = calculateCountOfNumber(num1);
        count2 = calculateCountOfNumber(num2);

        System.out.println("В числе " + num1 + " -> " + count1 + " цифр " + "\n" +
                "В числе " + num2 + " -> " + count2 + " цифр");

        if(count1 > count2){
            System.out.println("В первом числе больше цифр");
        }else if (count1 < count2){
            System.out.println("Во втором числе больше цифр");
        }else{
            System.out.println("В обоих числах одинаковое количество цифр");
        }
    }

    public static int calculateCountOfNumber(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
