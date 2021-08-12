import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("-");
        String date = parts[1] + "/" + parts[2] + "/" + parts[0];
        System.out.println(date);
    }
}