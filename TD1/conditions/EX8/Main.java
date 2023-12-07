package TD1.conditions.EX8;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le numéro du mois (M) :");
        int m = scanner.nextInt();
        System.out.println("Entrez l'année (Y) :");
        int y = scanner.nextInt();

        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Le nombre de jours de ce mois est : 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Le nombre de jours de ce mois est : 30");
                    break;
                case 2:
                    System.out.println("Le nombre de jours de ce mois est : 29");
                    break;
                default:
                    System.out.println("Mauvaise saisie. Le numéro du mois doit être compris entre 1 et 12.");
                    break;
            }
        } else {
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Le nombre de jours de ce mois est : 31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Le nombre de jours de ce mois est : 30");
                    break;
                case 2:
                    System.out.println("Le nombre de jours de ce mois est : 28");
                    break;
                default:
                    System.out.println("Mauvaise saisie. Le numéro du mois doit être compris entre 1 et 12.");
                    break;
            }
        }
    }
}