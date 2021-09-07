package by.mikhailov.algorithmization.decomposition;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние.
 *
 * Указание.
 * Координаты точек занести в массив
 */

public class Decomposition04 {
    public static void main(String[] args) {
        int[][] dots = {{1, 2}, {4, 5}, {12, 44}, {-10, 5}, {12, 11}};

        maxDistance(dots);
    }

    public static void maxDistance(int[][]dots){
        double maxDist = 0;
        double temp = 0;
        int[] dotA = new int[2];
        int[] dotB = new int[2];

        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots.length; j++) {
                temp = distanceBetweenDots(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
                if (temp > maxDist) {
                    maxDist = temp;

                    dotA[0] = dots[i][0];
                    dotA[1] = dots[i][1];

                    dotB[0] = dots[j][0];
                    dotB[1] = dots[j][1];
                }
            }
        }
        System.out.println("Максимальное расстояние между "
                + "[" + dotA[0] + "," + dotA[1] + "]" + " и " + "["+ dotB[0] + "," + dotB[1] + "]"
                + " c расстоянием " + maxDist);
    }

    public static double distanceBetweenDots(int x1 ,int y1 , int x2, int y2){
        double distance;
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        return distance;
    }
}
