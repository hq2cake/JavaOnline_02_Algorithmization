package by.mikhailov.algorithmization.decomposition;

/**
 * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 * которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Decomposition05 {
    public static void main(String[] args) {
        int[] array = {1,5,7,2,-10,2,23,11};

        int number1;
        number1 = findMaxNum(array);

        int number2;
        number2 = findNumAfterMax(number1,array);

        System.out.println("Второе по величине число: " + number2);
    }

    public static int findMaxNum(int[] array){
        int maxNum;

        maxNum = array[0];
        for(int num : array){
            if(maxNum < num)
                maxNum = num;
        }

        return maxNum;
    }

    public static int findNumAfterMax(int maxNum,int[] array){
        int numberAfterMax;

        numberAfterMax = array[0];
        for(int num : array){
            if(numberAfterMax < num && num != maxNum)
                numberAfterMax = num;
        }

        return numberAfterMax;
    }

}
