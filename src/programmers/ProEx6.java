package programmers;

import java.util.Arrays;

public class ProEx6 {
    public int[] solution(int[] arr) {
        int answer = 0;

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int d = arr[i];
            if (d >= 50 && d % 2 == 0) d /= 2;
            else if (d < 50 && d % 2 == 1) d = d * 2 + 1;
            else return ans;

            ans[i] = d;
        }

        return ans;
    }

    public static void main(String[] args) {
        ProEx6 p = new ProEx6();
        System.out.println(Arrays.toString(p.solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
}
