import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' || input.charAt(i) == 'g') {
                count++;
            }
        }
        double perc = (double) count / input.length() * 100;
        System.out.println(perc);
    }
}
