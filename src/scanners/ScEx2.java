package scanners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열을 입력하세요: ");
        String str = br.readLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = Integer.parseInt(br.readLine());
        System.out.println("입력한 정수:" + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = Double.parseDouble(br.readLine());
        System.out.println("입력한 실수: " + doubleValue);
    }
}
