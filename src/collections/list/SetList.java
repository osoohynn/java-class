package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("사과", "바나나", "사과", "메론");

        Set<String> set = new HashSet<>(list);

        List<String> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        System.out.println("정렬된 과일 목록: ");
        for (String s : sortedList) {
            System.out.println(s);
        }
    }
}
