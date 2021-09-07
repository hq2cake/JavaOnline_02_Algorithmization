package by.mikhailov.algorithmization.decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
 * треугольника
 */

public class Decomposition03 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Площадь правильного шестиугольника,со стороной " +
                a + " равна: " + (6 * areaOfTriangle(a)));
    }

    public static double areaOfTriangle(int a){

        return ((Math.sqrt(3) / 4.0) * (a * a));
    }
}
