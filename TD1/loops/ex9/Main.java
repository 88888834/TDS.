package TD1.loops.ex9;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre entier :");
        int n = scanner.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n /= 10;
        }

        System.out.println("La somme des chiffres est : " + sum);
    }
}