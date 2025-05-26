package throw1;

class A {
    void abc() {
        bcd();
    }
    void bcd() {
        try {
            Class cls = Class.forName("java.lang.Object");
            Thread.sleep(1000);
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class B {
    void abc() {
        try {
            bcd();
        } catch (InterruptedException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void bcd() throws InterruptedException, ClassNotFoundException {
        Class cls = Class.forName("java.lang.Object");
        Thread.sleep(1000);
    }
}

public class ThrowsException3 {
    public static void main(String[] args) {
        A a = new A();
        a.abc();
        B b = new B();
        b.abc();
    }
}