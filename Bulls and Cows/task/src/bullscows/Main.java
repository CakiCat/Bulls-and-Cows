package bullscows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulls = 0;
        int cows = 0;

        System.out.println("Input the length of the secret code: ");
        String lengths = scanner.nextLine();

        int length = 0;
        try {
            length = Integer.parseInt(lengths);
            if (length < 1) {
                System.out.println("Error");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("Error: " + lengths + " isn't a valid number.");
            System.exit(0);
        }



        boolean game = true;

        String sc = randomGenerator(length);
        int index = 1;
        while (game) {
            bulls = 0;
            cows = 0;
            System.out.println("Turn " + index + ":");
            String input = scanner.nextLine();
            for (int i = 0; i < sc.length(); i++) {
                if (input.charAt(i) == sc.charAt(i)) {
                    bulls++;
                } else {
                    for (int j = 0; j < sc.length(); j++) {
                        if (i != j && input.charAt(j) == sc.charAt(i)) {
                            cows++;
                        }
                    }

                }
            }
            if (cows > 0 && bulls > 0) {
                if (cows == 1 && bulls == 1) {
                    System.out.println("Grade: " + bulls + " bull and " + cows + " cow");
                } else if (cows == 1) {
                    System.out.println("Grade: " + bulls + " bulls and " + cows + " cow");
                } else if (bulls == 1) {
                    System.out.println("Grade: " + bulls + " bull and " + cows + " cows");
                } else {
                    System.out.println("Grade: " + bulls + " bulls and " + cows + " cows");
                }

            } else if (cows > 0 && bulls == 0) {
                if (cows == 1) {
                    System.out.println("Grade: " + cows + " cow");
                } else {
                    System.out.println("Grade: " + cows + " cows");
                }
            } else if (cows == 0 && bulls > 0) {
                if (bulls == 1) {
                    System.out.println("Grade: " + bulls + " bull");
                } else {
                    System.out.println("Grade: " + bulls + " bulls");
                }
            } else {
                System.out.println("None");
            }
            index++;
            if (bulls == length) {
                System.out.println("Congratulations! You guessed the secret code.");
                game = false;
            }
        }
    }
    public static String randomGenerator(int length) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of possible symbols in the code:");
        int range = scanner.nextInt();
        if (length > range) {
            System.out.println("Error: it's not possible to generate a code with a length of "+ length +" with "+ range +" unique symbols.");
            System.exit(0);
        }
        if (range > 36) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
            System.exit(0);
        }
        scanner.nextLine();
        List<String> randomLists = new ArrayList<String>(List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
        List<String> randomList = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            randomList.add(randomLists.get(i));
        }
        Collections.shuffle(randomList);
        StringBuilder result = new StringBuilder();
        for (var ch : randomList.subList(0, length)) {
            result.append(ch);
        }
        System.out.print("The secret is prepared: ");
        for (int i = 0; i < length; i++) {
            System.out.print("*");
        }
        if (randomList.size() < 11) {
            System.out.println(" (0-" + (randomList.size() -1) +").");
        } else if (randomList.size() == 11) {
            System.out.println(" (0-9, a).");
        } else {
            System.out.println(" (0-9, a-" + randomLists.get(randomList.size()-1) + ").");
        }
        System.out.println("Okay, let's start a game!");
        return result.toString();
    }
}
