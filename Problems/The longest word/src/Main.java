import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int temp = 0;
        String tempWord = "";

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() > temp) {
                temp = parts[i].length();
                tempWord = parts[i];
            }
        }
        System.out.println(tempWord);
    }
}