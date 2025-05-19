package nested.ex2;

import java.util.Random;

public class AnonymousRefMainV1 {
    public static void hello(Process1 process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 시작");
    }
    public static void main(String[] args) {
        hello(new Dice());
        hello(new Sum());
    }

    private static class Dice implements Process1 {
        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    private static class Sum implements Process1 {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}

interface Process1 {
    void run();
}