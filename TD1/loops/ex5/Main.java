package TD1.loops.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.println("Entrez un entier positif n :");
            n = scanner.nextInt();
        } while (n <= 0);

        System.out.println("Le " + n + "ème terme de la suite de Fibonacci est : " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}