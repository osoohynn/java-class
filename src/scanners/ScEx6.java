package scanners;

import java.util.Scanner;

public class ScEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) break;

            System.out.println(input);
        }
    }
}
