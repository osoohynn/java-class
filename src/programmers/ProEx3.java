package programmers;

public class ProEx3 {
    public String solution(String my_string, int[][] queries) {
        String answer = "";

        char[] d = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            d[i] = my_string.charAt(i);
        }

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            while (left < right) {
                char temp = d[left]; // r
                char temp2 = d[right];
                d[left++] = temp2;
                d[right--] = temp;
            }
        }

        for (int i = 0; i < d.length; i++) {
            answer += d[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        ProEx3 pro = new ProEx3();
        System.out.println(pro.solution("rermgorpsam", new int[][] {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
    }
}
