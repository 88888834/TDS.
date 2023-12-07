package TD1.Tables.ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String binaryRepresentation = "";

        while (n > 0) {
            binaryRepresentation = (n % 2) + binaryRepresentation;
            n /= 2;
        }

        System.out.println("Représentation binaire : " + binaryRepresentation);
    }
}
