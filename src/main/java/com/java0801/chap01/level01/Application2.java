package src.main.java.com.java0801.chap01.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int num = Integer.parseInt(input);

        if(num % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("짝수가 아니다.");
        }
    }

}