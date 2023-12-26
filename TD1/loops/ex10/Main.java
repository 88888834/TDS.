package TD1.loops.ex10;

public class  Main {
    public static void main(String[] args) {
        int sum;

        for (int i = 100; i <= 999; i++) {
            sum = 0;
            int num = i;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}