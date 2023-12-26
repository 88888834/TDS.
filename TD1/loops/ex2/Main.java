package TD1.loops.ex2;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre N :");
        int n = scanner.nextInt();
        int somme = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                somme += i;
            }
        }

        System.out.println("La somme des entiers impairs inférieurs à N est : " + somme);
    }
}