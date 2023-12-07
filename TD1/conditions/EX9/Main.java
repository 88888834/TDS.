package TD1.conditions.EX9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le premier nombre :");
        int num1 = scanner.nextInt();
        System.out.println("Entrez le deuxième nombre :");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Les nombres dans l'ordre croissant sont : " + num1 + " et " + num2);
    }
}