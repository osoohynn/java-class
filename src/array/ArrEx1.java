package array;

public class ArrEx1 {
    public static void main(String[] args) {
        int[] students = new int[10];

        // 모두 0으로 초기화
        for (int i = 0; i < students.length; i++) {
            students[i] = 0;
        }

        // 배열 내용 모두 출력
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + " ");
        }
    }
}
