package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrEx7 {
    public int[] solution(int l, int r) {
        List<Integer> q = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();

        q.add(5);

        while (!q.isEmpty()) {
            int cur = q.remove(0);

            if (cur >= l && cur <= r) {
                ans.add(cur);
            }

            if (cur * 10 <= r) {
                q.add(cur * 10);
                q.add(cur * 10 + 5);
            }
        }

        if (ans.isEmpty()) { ans.add(-1); }

        int[] answer = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        ArrEx7 arrEx7 = new ArrEx7();
        System.out.println(Arrays.toString(arrEx7.solution(5, 555)));
    }
}
