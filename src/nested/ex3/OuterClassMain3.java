package nested.ex3;

class OuterClass3 {
    public void method() {
        class LocalClass {
            void hello() {
                System.out.println("LocalClass.hello");
            }
        }
        new LocalClass().hello();
    }
}

public class OuterClassMain3 {
    public static void main(String[] args) {
        OuterClass3 outerClass = new OuterClass3();
        outerClass.method();
    }
}