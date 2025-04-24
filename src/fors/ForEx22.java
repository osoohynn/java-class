package fors;

public class ForEx22 {
    public static void main(String[] args) {
        char c = 'A';
        int n = 0;
        for (int i = 3; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(c++);
            }
            for (int j = 0; j < (3 - i); j++) {
                System.out.print(n++);
            }
            System.out.println();
        }
    }
}
