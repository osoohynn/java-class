package programmers;

public class ProEx5 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int end = (int) my_string.length() / m;

        for (int i = 0; i < end; i++) {
            int start = m * i;
            String cur = my_string.substring(start, start + m);
            answer += cur.charAt(c - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        ProEx5 p = new ProEx5();
        System.out.println(p.solution("programmers", 1, 1));
    }
}
