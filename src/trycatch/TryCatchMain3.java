package trycatch;

public class TryCatchMain3 {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 1);
            int num = Integer.parseInt("10A");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 바꿀 수 없습니다.");
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } finally {
            System.out.println("프로그램 종료");
        }
    }
}
