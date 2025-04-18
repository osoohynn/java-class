package finals;

public class FinalFieldMain1 {
    public static void main(String[] args) {
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit.getValue());
        System.out.println(constructInit2.getValue());

        System.out.println("필드 초기화");
        FieldInit fieldInit = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit.getValue());
        System.out.println(fieldInit2.getValue());
        System.out.println(fieldInit3.getValue());

        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}

class ConstructInit {
    private final int value;

    public ConstructInit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class FieldInit {
    public static final int CONST_VALUE = 10;
    private final int value = 10;

    public int getValue() {
        return value;
    }
}