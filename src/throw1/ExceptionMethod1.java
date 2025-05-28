package throw1;

public class ExceptionMethod1 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            throw new Exception("dfsfs");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
