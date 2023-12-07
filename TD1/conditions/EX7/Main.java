package TD1.conditions.EX7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier de trois chiffres non nuls (N) :");
        int n = scanner.nextInt();
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int[] arr = {a * 100 + b * 10 + c, a * 100 + c * 10 + b, b * 100 + a * 10 + c, b * 100 + c * 10 + a, c * 100 + a * 10 + b, c * 100 + b * 10 + a};
        System.out.println("Les nombres formés par les chiffres de N sont : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
