package TD1.Tables.ex1;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[scanner.nextInt()];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
        }

        int max = tab[0];
        int min = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }

            if (tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println("Valeur maximale : " + max);
        System.out.println("Valeur minimale : " + min);
    }
}