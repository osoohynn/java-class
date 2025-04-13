package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProEx1 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length;) {
            if (stk.isEmpty()) { stk.add(arr[i]); i++; }
            else if (stk.get(stk.size() - 1) < arr[i]) { stk.add(arr[i]); i++; }
            else stk.remove(stk.size() - 1);
        }

        int[] answer = new int[stk.size()];

        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        ProEx1 pro = new ProEx1();
        int[] answer = pro.solution(new int[]{1,4,2,5,3});
        System.out.println(Arrays.toString(answer));
    }
}
