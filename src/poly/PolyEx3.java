package poly;

public class PolyEx3 {
    public static void main(String[] args) {
        AbstractParent ac = new AChild();
    }
}

abstract class AbstractParent {
}

class AChild extends AbstractParent {

}