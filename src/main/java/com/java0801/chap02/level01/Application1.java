package src.main.java.com.java0801.chap02.level01;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */
        int sum = 0;
        for(int i = 1; i < 11; i++) {
            sum += i;
        }

        System.out.println("1부터 10까지의 합 : " + sum);
    }

}