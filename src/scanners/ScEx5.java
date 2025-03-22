package scanners;

import java.util.Scanner;

public class ScEx5 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break;
            total += n;
        }
        System.out.println(total);
    }
}
