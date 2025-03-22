package fors;

public class ForEx4 {
    public static void main(String[] args) {
        // 1부터 10 까지 숫자 출력하는 코드
        // 만약 3의 배수 또는 5의 배수라면 출력 안함

        int i = 0;
        while (i < 10) {
            i++;
            if (i % 3 == 0 || i % 5 == 0) continue;
            System.out.println(i);
        }
    }
}
