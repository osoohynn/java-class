package quizes;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력하세요. ");
            int n = sc.nextInt();

            if (n > 100 || n < 0) break;
            else if (n >= 80) System.out.println("축하합니다. 합격입니다.");
            else System.out.println("죄송합니다. 불합격입니다.");
        }
    }
}
