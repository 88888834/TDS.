package TD1.conditions.EX1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la première variable :");
        int num1 = scanner.nextInt();
        System.out.println("Entrez la deuxième variable :");
        int num2 = scanner.nextInt();
        System.out.println("Entrez la troisième variable :");
        int num3 = scanner.nextInt();


        if(num1 > num2 && num1 > num3) {
            System.out.println("Le maximum des trois variables est : " + num1);
        } else if(num2 > num1 && num2 > num3) {
            System.out.println("Le maximum des trois variables est : " + num2);
        } else {
            System.out.println("Le maximum des trois variables est : " + num3);
        }
    }
}
    
