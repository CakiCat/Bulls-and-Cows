import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ρ = scanner.nextDouble();
        double h = scanner.nextDouble();
        double result = ρ * h * 9.8;
        System.out.println(result);
    }
}