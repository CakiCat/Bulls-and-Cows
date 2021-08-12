import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        int count = 0;
        while (true) {
            count = 0;
            Random random = new Random(k);
            for (int i = 0; i < n; i++) {
                double number = random.nextGaussian();
                if (number > m) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == n) {
                break;
            } else {
                k++;
            }


        }
        System.out.println(k);
    }
}