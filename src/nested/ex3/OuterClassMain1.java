package nested.ex3;

class OuterClass1 {
    static class NestedClass {
        public void hello() {
            System.out.println("NestedClass.hello");
        }
    }
}

public class OuterClassMain1 {
    public static void main(String[] args) {
        OuterClass1 outerClass = new OuterClass1();
        OuterClass1.NestedClass nestedClass = new OuterClass1.NestedClass();
        nestedClass.hello();
    }
}