package AllUnits;

import java.util.Random;
import java.util.Scanner;

public class OptionalTask2 {
    public static int getRandom(int min, int max) {
        Random ran = new Random();
        int n = max - min + 1;
        int i = ran.nextInt() % n;
        if (i < 0)
            i = -i;
        return min + i;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = in.nextInt();
        int[][] matrixA;
        matrixA = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = getRandom(-20, 20);
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Введите столбец, который будем сортировать: ");
        int e = in.nextInt();
        int temp;
        for (int i = 0; i < n; i++)
            for (int k = i + 1; k < n; k++) {
                if (matrixA[i][e] > matrixA[k][e]) {
                    for (int j = 0; j < n; j++) {
                        temp = matrixA[i][j];
                        matrixA[i][j] = matrixA[k][j];
                        matrixA[k][j] = temp;
                    }
                }
            }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
