package tdarray;

import java.util.Scanner;

public class TArrEx3 {
    public static void main(String[] args) {
        String[][] arr = new String[10][2];

        int count = 0;

        Scanner sc = new Scanner(System.in);

        while (count < 10) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("이름을 입력하세요: ");
                String name = sc.next();

                System.out.print("가격을 입력하세요: ");
                String price = sc.next();

                arr[count][0] = name;
                arr[count][1] = price;

                count++;
            } else if (choice == 2) {
                for (int i = 0; i < count; i++) {
                    System.out.println(arr[i][0] + ": " + arr[i][1] + "원");
                }
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }
    }
}
