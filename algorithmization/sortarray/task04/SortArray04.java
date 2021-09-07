package by.mikhailov.algorithmization.sortarray.task04;

/**
 * Сортировка обменами.
 * Дана последовательность a1<= a2 <= ... <= an.
 * Требуется перставить числа в порядке возрастания.Для этого сравниваются два соседних числа ai и ai+1
 * Если ai>ai+1 , то делается перестановка.Так продолжается до тех пор пока элементы не станут расположены в порядке возрастания
 * Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
 */

public class SortArray04 {
    public static void main(String[] args) {
        Exchange ex = new Exchange();

        ex.array = sortExchange().array;
        ex.count = sortExchange().count;

        outputArray(ex , "Сортировка обменом:");

        System.out.println("Количество перестановок: " + ex.count);
    }

    public static void outputArray(Exchange ex, String msg) {
        System.out.print(msg + " ");

        for (int i = 0; i < ex.array.length; i++) {
            System.out.printf("%4d", ex.array[i]);
        }
        System.out.println();
    }

    public static Exchange sortExchange(){
        Exchange ex = new Exchange();

        ex.array = new int[]{-6,55,-22,0,-13,-17,-19};

        int temp;

        for (int i = 0; i < ex.array.length; i++) {
            for (int j = i+1; j < ex.array.length; j++) {

                if(ex.array[i] > ex.array[j]){
                    temp = ex.array[i];
                    ex.array[i] = ex.array[j];
                    ex.array[j] = temp;

                    ex.count ++;
                }
            }
        }

        return ex;
    }
}
