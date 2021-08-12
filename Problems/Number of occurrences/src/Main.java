import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String sub = scanner.nextLine();
        String[] parts = input.split(" ");
        int count = input.length() - input.replaceAll(sub,"").length();
        int count1 = count / sub.length();
        System.out.println(count1);
    }
}