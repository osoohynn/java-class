package nested.ex2;

import java.util.Random;

public class AnonymousRefMainV3 {
    public static void hello(Process3 process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 시작");
    }

    public static void main(String[] args) {
        Process3 dice = new Process3() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process3 sum = new Process3() {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}

interface Process3 {
    void run();
}