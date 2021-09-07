package by.mikhailov.algorithmization.decomposition;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 * если угол между сторонами длиной X и Y— прямой.
 */

public class Decomposition09 {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        int z = 3;
        int t = 3;
        System.out.println(area(x, y, z, t));
    }

    public static double area(int x, int y, int z, int t) {
        double c;
        c = Math.sqrt(x * x + y * y);

        return triangleArea(x, y, c) + triangleArea(c, z, t);
    }

    public static double triangleArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
