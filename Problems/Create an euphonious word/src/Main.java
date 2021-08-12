import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String parts =  input.replaceAll("[bcdfghjklmnpqrstvwxz]", "0");
        parts = parts.replaceAll("[aeiouy]", "1");
        int count = 0;
        int index = 0;
        while (index < parts.length() - 2) {
            if ((parts.charAt(index) == '0' &&
                    parts.charAt(index + 1) == '0' &&
                    parts.charAt(index + 2) == '0') ||
                    (parts.charAt(index) == '1' &&
                            parts.charAt(index + 1) == '1' &&
                            parts.charAt(index + 2) == '1')) {
                count++;
                index += 2;
            } else {
                index++;
            }
        }
        System.out.println(count);
    }
}