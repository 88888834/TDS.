package TD1.loops.ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Entrez le " + (i + 1) + "ème nombre :");
            nums[i] = scanner.nextInt();
        }

        System.out.println("Le total obtenu est : " + sum(nums));
    }

    public static int sum(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}