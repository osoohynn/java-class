package collections.set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetMain1 {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        System.out.println("이메일 주소 5개를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            emails.add(email);
        }

        System.out.println("중복 제거 후 이메일 목록");
        for (String email : emails) {
            System.out.println(email);
        }
        System.out.println("총 " + emails.size() + "개의 이메일이 저장되었습니다.");
    }
}
