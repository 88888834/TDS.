package TD1.Tables.ex5;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] array = new String[n];

        // Récupération des éléments du tableau
        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }

        // Décale les éléments du tableau
        String lastElement = array[n - 1];
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;

        // Affichage du résultat
        System.out.println("Le tableau modifié est : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}