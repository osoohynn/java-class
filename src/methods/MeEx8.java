package methods;

public class MeEx8 {
    public static void main(String[] args) {
        print("Hello world", 3);
        print("진주쌤 짱", 5);
        print("2-4반 최고!", 7);
    }

    public static void print(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}
