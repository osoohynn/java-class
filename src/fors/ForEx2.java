package fors;

public class ForEx2 {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8 9
        // 10 9 8 7 6 5 4 3 2 1
        // 0 1 2 3 4 5 6 7 8 9 10

        int i = 10;

        do {
            System.out.println("현재 숫자는: "+ i);
            i++;
        } while (i < 3);
    }
}