package nested.ex3;

public class OuterClassMain4 {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };
        hello.hello();
    }
}

interface Hello {
    void hello();
}