package throw1.ex4;

public class UserException {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.checkScore(85);
            a.checkScore(150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class MinusException extends Exception {
    public MinusException() {
        super();
    }

    public MinusException(String message) {
        super(message);
    }
}
class OverException extends Exception {
    public OverException() {
        super();
    }
    public OverException(String message) {
        super(message);
    }
}

class A {
    void checkScore(int score) throws MinusException, OverException {
        if (score < 0) {
            throw new MinusException("예외 발생: 음수값입력");
        } else if (score > 100) {
            throw new OverException("예외 발생: 100점 초과");
        } else {
            System.out.println("정상적인 값입니다.");
        }
    }
}