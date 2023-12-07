package TD1.Tables.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double threshold = scanner.nextDouble();
        int count = 0;

        for (int i = 0; i < n; i++) {
            double average = scanner.nextDouble();
            if (average >= threshold) {
                count++;
            }
        }

        System.out.println("Nombre d'étudiants ayant une moyenne supérieure ou égale au seuil : " + count);
    }
}
