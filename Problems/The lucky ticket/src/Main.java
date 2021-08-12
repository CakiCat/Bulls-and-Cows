import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] parts = num.split("");
        int parts1 = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]);
        int parts2 = Integer.parseInt(parts[3]) + Integer.parseInt(parts[4]) + Integer.parseInt(parts[5]);
        if (parts1 == parts2) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}