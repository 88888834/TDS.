package TD1.loops.ex3.quest3;

import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int position = 0;

        do {
            System.out.println("Entrez le nombre " + (position + 1) + " :");
            number = scanner.nextInt();

            if (number > max) {
                max = number;
                maxIndex = position;
            }

            position++;
        } while (number != 0);

        System.out.println("Le maximum de cette suite est : " + max);
        System.out.println("Et ce nombre avait été saisi à la position : " + (maxIndex + 1));
    }
}