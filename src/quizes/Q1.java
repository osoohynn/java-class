package quizes;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.삽입\n2.수정\n3.삭제\n숫자를 선택하세요.");
        int n = scanner.nextInt();

        String x;
        if (n == 1) x = "삽입";
        else if (n == 2) x = "수정";
        else x = "삭제";

        System.out.println(x + "를 선택하셨습니다.");
    }
}
