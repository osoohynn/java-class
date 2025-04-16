package statics;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        String deco = DecoUtil2.deco(s);
        System.out.println("Before: " + s);
        System.out.println("After: " + deco);
    }
}

class DecoUtil2 {
    public static String deco(String str) {
        return "*" + str + "*";
    }
}
