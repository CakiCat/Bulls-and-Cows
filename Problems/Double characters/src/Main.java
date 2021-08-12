import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("");
        String inputx = "";
        for (int i = 0; i < input.length(); i++) {
            inputx += parts[i] + parts[i];

        }
        System.out.println(inputx);
    }
}