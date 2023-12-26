package TD1.Tables.ex4;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] matrix1 = new double[n][n];
        double[][] matrix2 = new double[n][n];
        double[][] sum = new double[n][n];

        // Récupération des éléments de la première matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextDouble();
            }
        }

        // Récupération des éléments de la deuxième matrice
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextDouble();
            }
        }

        // Calcul de la somme des deux matrices
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Affichage du résultat
        System.out.println("La somme des deux matrices est : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}