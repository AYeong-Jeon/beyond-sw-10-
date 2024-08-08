package src.main.java.com.java0807.chap02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String input = sc.nextLine();

        String[] c = input.toUpperCase().split(" ");
        String[] uniqueArray = Arrays.stream(c).distinct().toArray(String[]::new);
        ArrayList<String> originList = new ArrayList<>(Arrays.asList(c));

        System.out.println("===== 단어 빈도 =====");

        int a=0;
        String answer = "";
        for (int i=0 ; i<uniqueArray.length ; i++) {
            int b = Collections.frequency(originList, uniqueArray[i]);
            System.out.println(uniqueArray[i] + " : " + b);
            if (b>a) {
                a=b;
                answer = uniqueArray[i];
            }
        }

        System.out.println("가장 빈도 높은 단어 : " + answer + " " + a);
    }
}
