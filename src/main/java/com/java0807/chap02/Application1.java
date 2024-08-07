package src.main.java.com.java0807.chap02;

import java.io.IOException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열 입력 : ");
        String input = sc.nextLine();

        StringBuilder answer = new StringBuilder();
        String[] inputList = input.split(" ");
        for (int i = 0; i < inputList.length; i++) {
            answer.append(inputList[i].substring(0, 1).toUpperCase()).append(inputList[i].substring(1)).append(" ");
        }

        System.out.println(answer);
    }
}
