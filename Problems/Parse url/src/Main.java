import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("&");
        boolean pass = false;
        int ch = 0;
        if (parts[0].contains("pass")){
           ch = parts[0].indexOf("=");
           pass = true;
            System.out.println("pass : " + parts[0].substring(ch + 1));
        }
        int ch1 = parts[1].indexOf("=");
        System.out.println("port : " + parts[1].substring(ch1 + 1));
        int ch2 = parts[2].indexOf("=");
        if (ch2 == parts[2].length() - 1) {
            System.out.println("cookie : not found");
        } else {
            System.out.println("cookie : " + parts[2].substring(ch2 + 1));
        }
        int ch3 = parts[3].indexOf("=");
        System.out.println("host : " + parts[3].substring(ch3 + 1));
        if (pass) {
            System.out.println("password : " + parts[0].substring(ch + 1));
        }
    }
}