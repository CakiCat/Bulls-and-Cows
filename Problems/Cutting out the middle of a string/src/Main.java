import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = input.length() / 2;

        if (input.length() % 2 == 0) {
            String start = input.substring(0, num - 1);
            String end = input.substring(num + 1);
            System.out.println(start + end);
        } else {
            String start = input.substring(0, num);
            String end = input.substring(num + 1);
            System.out.println(start + end);
        }
    }
}