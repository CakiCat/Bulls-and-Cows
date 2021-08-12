import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pal = scanner.nextLine();
        boolean palindrome = false;
        int j = pal.length() - 1;
        if (pal.length() == 1) {
            palindrome = true;
        } else {
            for (int i = 0; i < pal.length() / 2; i++){
                if (pal.length() == 1) {
                    palindrome = true;
                }
                if (pal.charAt(i) == pal.charAt(j)) {
                    j--;
                    palindrome = true;
                } else {
                    palindrome = false;
                    break;
                }
            }
        }

        if (palindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }



    }
}