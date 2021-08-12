import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        boolean end = false;
        int temp = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.charAt(i) == 't' &&
                    input.charAt(i + 1) == 'h' &&
                    input.charAt(i + 2) == 'e') {
                temp = i;
                end = true;
                break;
            }
        }
        if (end) {
            System.out.println(temp);
        } else {
            System.out.println(-1);
        }
    }
}