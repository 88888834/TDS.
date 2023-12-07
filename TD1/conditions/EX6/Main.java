package TD1.conditions.EX6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la première valeur entière (A) :");
        int a = scanner.nextInt();
        System.out.println("Entrez la deuxième valeur entière (B) :");
        int b = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Le produit de A et B est 0.");
        } else if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            System.out.println("Le produit de A et B est positif.");
        } else {
            System.out.println("Le produit de A et B est négatif.");
        }
    }
}