package statics;

public class StaticEx2 {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        System.out.println("sum="+MathArrayUtils.sum(values));
        System.out.println("average="+MathArrayUtils.average(values));
        System.out.println("min="+MathArrayUtils.min(values));
        System.out.println("max="+MathArrayUtils.max(values));
    }
}

class MathArrayUtils {
    private MathArrayUtils() {}

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int average(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        return max;
    }
}