package src.main.java.com.java0801.chap02.level01;

import java.io.IOException;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("1부터 " + num + "까지의 합 : " + sum);
    }

}