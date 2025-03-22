package fors;

public class ForEx7 {
    public static void main(String[] args) {
        System.out.println("==========while문=========");
        int i = 1;
        int whileSum = 0;
        while (i < 4) {
            whileSum += i;
            System.out.println("i=" + i + ", sum=" + whileSum);
            i++;
        }

        System.out.println("\n==========for문===========");
        int forSum = 0;
        for (int j = 1; j < 4; j++) {
            forSum += j;
            System.out.println("i=" + j + ", sum=" + forSum);
        }
    }
}
