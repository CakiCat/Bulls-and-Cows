import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            System.out.println(
                    input.matches("vwxyz|abc|xy|pqrst") || input.length() <= 1 ? "true" : "false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}