package ifs;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이템과 가격을 각각 입력하세요.");
        int item = sc.nextInt();
        int age = sc.nextInt();

        if (item >= 10000 || age <= 10) item -= 1000;

        System.out.println(item);
    }
}