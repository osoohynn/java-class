package programmers;

public class ProEx4 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String fixed_str = my_string.substring(s, e + 1);

        StringBuffer sb = new StringBuffer(fixed_str);
        String reversed = sb.reverse().toString();
        answer = my_string.replaceAll(fixed_str, reversed);

        return answer;
    }

    public static void main(String[] args) {
        ProEx4 solution = new ProEx4();
        System.out.println(solution.solution("Progra21Sremm3",6,12));
    }
}
