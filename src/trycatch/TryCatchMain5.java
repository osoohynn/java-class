package trycatch;

public class TryCatchMain5 {
    public static void main(String[] args) {
        String[] data = {"10", "20", "삽십"};
        for (int i = 0; i <= data.length; i++) {
            try {
                int num = Integer.parseInt(data[i]);
                System.out.println("반환된 숫자: " + num);
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 발생");
            }
        }
    }
}
