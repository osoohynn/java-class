package throw1;

public class ExceptionMethod2 {
    public static void main(String[] args) {
        A2 a = new A2();
        try {
            a.abc();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
class A2 {
    void abc() throws NumberFormatException {
        bcd();
    }

    void bcd() throws NumberFormatException {
        cde();
    }
    void cde() throws NumberFormatException {
        int num = Integer.parseInt("10A");
    }
}