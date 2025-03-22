package scanners;

import java.util.Scanner;

public class ScEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요:");
        int n = scanner.nextInt();

        System.out.print("입력한 숫자 " + n + "는 ");

        if (n % 2 == 0) System.out.print("짝수");
        else System.out.print("홀수");

        System.out.println("입니다.");
    }
}
