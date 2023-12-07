package TD1.loops.ex3.quest2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[20];
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < 20; i++) {
            System.out.println("Entrez le nombre " + (i + 1) + " :");
            numbers[i] = scanner.nextInt();

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("Le maximum de ces 20 nombres est : " + max);
        System.out.println("Et ce nombre avait été saisi à la position : " + (maxIndex + 1));
    }
}