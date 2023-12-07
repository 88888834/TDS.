package TD1.loops.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = getFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }

    /**
     * @param n
     * @return
     */
    private static long getFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return  getFactorial(n);
}
}
