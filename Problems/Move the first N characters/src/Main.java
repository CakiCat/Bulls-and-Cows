import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int num = scanner.nextInt();
        if (num > input.length()) {
            System.out.println(input);
        } else {
            String sub1 = input.substring(num);
            String sub2 = input.substring(0, num);
            System.out.println(sub1 + sub2);
        }

    }
}