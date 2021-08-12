import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double a, b, c, x, y, z, t;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        x = (b * b) - (4 * a * c);

        t = (double) Math.sqrt(x);
        y = (-b + t) / (2 * a);
        z = (-b - t) / (2 * a);
        if (y > z) {
            System.out.println(+z + " " + y);
        } else
            System.out.println(+y + " " + z);
    }
}