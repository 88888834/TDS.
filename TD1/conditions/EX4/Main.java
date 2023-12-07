package TD1.conditions.EX4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la moyenne de l'étudiant :");
        int average = scanner.nextInt();

        if(average >= 16) {
            System.out.println("Mention : T. Bien");
        } else if(average >= 14) {
            System.out.println("Mention : Bien");
        } else if(average >= 12) {
            System.out.println("Mention : A. Bien");
        } else if(average >= 10) {
            System.out.println("Mention : Passable");
        } else {
            System.out.println("Mention : Échec");
        }
    }
}
