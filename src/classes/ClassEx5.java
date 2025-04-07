package classes;

public class ClassEx5 {
    private boolean bool;
    private int num1;
    private double num2;
    private String str;

    private void printFieldValue() {
        System.out.println(bool);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(str);
    }

    public void printLocalValue() {
        int num;
        // System.out.println(num);
    }

    public static void main(String[] args) {
        ClassEx5 c = new ClassEx5();
        c.printFieldValue();
        c.printLocalValue();
    }
}