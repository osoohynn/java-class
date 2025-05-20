package nested.ex3;

class OuterClass2 {
    class InnerClass {
        public void hello() {
            System.out.println("InnerClass.hello");
        }
    }
}

public class OuterClassMain2 {
    public static void main(String[] args) {
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.hello();
    }
}