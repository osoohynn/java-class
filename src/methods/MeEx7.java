package methods;

public class MeEx7 {
    public static void main(String[] args) {
        System.out.println("평균값: " + getAvg(1, 2, 3));
        System.out.println("평균값: " + getAvg(15 ,25, 35));
    }

    public static double getAvg(int a, int b, int c) {
        int total = a + b + c;
        return total/3.0;
    }
}
