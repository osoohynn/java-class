package scanners;

import java.util.Scanner;

public class ScEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allTotal = 0;

        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int input = scanner.nextInt();

            if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else if (input == 1) {
                System.out.print("상품명을 입력하세요: "); String name = scanner.next();
                System.out.print("상품의 가격을 입력하세요: "); int price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: "); int count = scanner.nextInt();

                int total = price * count;
                allTotal += total;

                System.out.println("상품명:" + name + " 가격:" + price + " 수량:" + count + " 합계:" + total);
            }
            else if (input == 2) System.out.println("총 비용: " + allTotal);
            else System.out.println("올바른 옵션을 선택해주세요.");
        }
    }
}
