package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String, String> capital = new HashMap<>();
        capital.put("한국", "서울");
        capital.put("일본", "도쿄");
        capital.put("미국", "워싱턴");

        System.out.println("<keySet() 사용>");
        for (String key : capital.keySet()) {
            System.out.println(key + ": " + capital.get(key));
        }

        System.out.println("<entrySet() 사용>");
        for (Map.Entry<String, String> entry : capital.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
