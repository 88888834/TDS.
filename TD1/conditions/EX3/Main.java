package TD1.conditions.EX3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Entrez la valeur de a :");
        int a = scanner.nextInt();
        System.out.println("Entrez la valeur de b :");
        int b = scanner.nextInt();

        System.out.println("1. Vérifier si la somme a + b est paire");
        System.out.println("2. Vérifier si le produit ab est pair");
        System.out.println("3. Déterminer le signe de la somme a + b");
        System.out.println("4. Déterminer le signe du produit ab");
        System.out.println("Entrez le numéro de l'option que vous souhaitez choisir :");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if((a + b) % 2 == 0) {
                    System.out.println("La somme a + b est paire.");
                } else {
                    System.out.println("La somme a + b n'est pas paire.");
                }
                break;
            case 2:
                if((a * b) % 2 == 0) {
                    System.out.println("Le produit ab est pair.");
                } else {
                    System.out.println("Le produit ab n'est pas pair.");
                }
                break;
            case 3:
                if((a + b) > 0) {
                    System.out.println("Le signe de la somme a + b est positif.");
                } else if((a + b) < 0) {
                    System.out.println("Le signe de la somme a + b est négatif.");
                } else {
                    System.out.println("Le signe de la somme a + b est zéro.");
                }
                break;
            case 4:
                if((a * b) > 0) {
                    System.out.println("Le signe du produit ab est positif.");
                } else if((a * b) < 0) {
                    System.out.println("Le signe du produit ab est négatif.");
                } else {
                    System.out.println("Le signe du produit ab est zéro.");
                }
                break;
            default:
                System.out.println("Option invalide. Veuillez entrer un numéro entre 1 et 4.");
        }
    }
}

