package collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListMain1 {
    public static void main(String[] args) {
        List<String> interests = new ArrayList<>();
//        interests.add("맛집");
//        interests.add("여행");
//        interests.add("영화");

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("관심사를 입력하세요: ");
            interests.add(sc.next());
        }

        for (String interest : interests) {
            System.out.println(interest);
        }
    }
}
