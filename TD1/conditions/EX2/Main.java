package TD1.conditions.EX2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la valeur de a :");
        int a = scanner.nextInt();
        System.out.println("Entrez la valeur de b :");
        int b = scanner.nextInt();
        System.out.println("Entrez la valeur de c :");
        int c = scanner.nextInt();

        int discriminant = b * b - 4 * a * c;

        if(discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Les solutions de l'équation sont : " + x1 + " et " + x2);
        } else if(discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("La solution de l'équation est : " + x);
        } else {
            System.out.println("L'équation n'a pas de solution réelle.");
        }
    }
}
