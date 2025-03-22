package fors;

public class ForEx18 {
    public static void main(String[] args) {
        char a = 'A';
        int n = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= (2 - i); j++, a++) {
                System.out.print(a + " ");
            }
            for (int k = 0; k <= (i - 1); k++, n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
