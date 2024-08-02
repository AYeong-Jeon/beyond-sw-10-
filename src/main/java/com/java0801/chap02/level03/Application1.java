package src.main.java.com.java0801.chap02.level03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("2보다 큰 정수를 하나 입력하세요 : ");
            int num = sc.nextInt();

            boolean check = true;

            if(num <= 1) {
                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            } else {
                for(int i = 2; i < num; i++) {
                    if(num % i == 0) {
                        check = false;
                        break;
                    }
                }
                System.out.println(check ? "소수다." : "소수가 아니다.");
                break;
            }
        }
    }
}
