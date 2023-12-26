package TD1.loops.ex4;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.println("Entrez le premier nombre a :");
            a = scanner.nextInt();
        } while (a <= 0);

        do {
            System.out.println("Entrez le deuxième nombre b :");
            b = scanner.nextInt();
        } while (b <= 0);

        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd(a, b));
    }

    public static int pgcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return pgcd(b, a % b);
    }
}