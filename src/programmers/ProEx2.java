package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProEx2 {
    public int[] solution(int n) {
        List<Integer> stk = new ArrayList<>();
        stk.add(n);

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
                stk.add(n);
            } else {
                n = 3 * n + 1;
                stk.add(n);
            }
        }

        int[] answer = new int[stk.size()];

        for (int i = 0; i < stk.size(); i++) {
            answer[i] = stk.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
//        ProEx1 pro = new ProEx1();
//        int[] answer = pro.solution(new int[]{1,4,2,5,3});
//        System.out.println(Arrays.toString(answer));

        ProEx2 pro = new ProEx2();
        int[] answer = pro.solution(10);
        System.out.println(Arrays.toString(answer));
    }
}
