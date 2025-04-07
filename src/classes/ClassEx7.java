package classes;

public class ClassEx7 {
    public static void printIntData(int ...values) {
        System.out.println("Input int data length: " + values.length);
        for (int value: values) {
            System.out.println(value);
        }
    }

    public static void printStringData(String ...values) {
        System.out.println("Input String data length: " + values.length);
        for (String value: values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        printIntData(0, 1, 2, 3, 4, 5);
        printIntData(1, 2, 3);
        printIntData();

        printStringData("사과", "오렌지");
        printStringData();
    }
}
