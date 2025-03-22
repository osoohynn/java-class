package fors;

public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: " + i + " 현재 숫자의 합은: " + sum);
                break;
            }
            i++;
        }
    }
}
