package methods;

public class MeEx5 {
    public static void main(String[] args) {
        double number = 1.5;
        printNum(number);
        printNum((int) number);
    }

    public static void printNum(int n) {
        System.out.println("숫자: " + n);
    }

    public static void printNum(double n) {
        System.out.println("숫자: " + n);
    }
}