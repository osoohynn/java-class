package programmers;

public class ProEx7 {
    public String solution(String n_str) {
        int k = 0;
        while (true) {
            char c = n_str.charAt(k);
            if (((int) c - '0') != 0) break;
            k++;
        }

        String answer = n_str.substring(k);
        return answer;
    }

    public static void main(String[] args) {
        ProEx7 p = new ProEx7();
        System.out.println(p.solution("0010"));
    }
}
