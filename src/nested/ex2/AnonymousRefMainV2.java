package nested.ex2;

import java.util.Random;

public class AnonymousRefMainV2 {
    public static void hello(Process2 process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 시작");
    }

    public static void main(String[] args) {
        class Dice implements Process2 {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }
        class Sum implements Process2 {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }
        hello(new Dice());
        hello(new Sum());
    }
}

interface Process2 {
    void run();
}