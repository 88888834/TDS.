package TD1.conditions.EX5;
import java.util.Scanner;
public class Main {

    /**
      * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez la langue ('f' pour français, 'a' pour anglais) : ");
        String lang = scanner.next();

        System.out.println("Entrez l'heure (0 - 23) : ");
        int hour = scanner.nextInt();

        if (lang.equalsIgnoreCase("f")) {
            if (hour >= 0 && hour < 18) {
                System.out.println("Bonjour");
            } else if (hour >= 18 && hour < 22) {
                System.out.println("Bonsoir");
            } else {
                System.out.println("Bonne nuit");
            }
        } else if (lang.equalsIgnoreCase("a")) {
            if (hour >= 0 && hour < 18) {
                System.out.println("Good Morning");
            } else if (hour >= 18 && hour < 22) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }
        } else {
            System.out.println("Langue non reconnue");
        }

        // scanner.close(;
}
}
