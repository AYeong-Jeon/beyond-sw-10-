package src.main.java.com.java0802.chap01.level02;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요. (ex : 980923-2000000)");
        String personalNumber = sc.nextLine();

        String a="", b="";
        if(personalNumber.contains("-")) {
            a = personalNumber.substring(0, 8);
            b = stringToAsterisk(personalNumber.substring(8));
        }

        System.out.println(a+b);
    }

    public static String stringToAsterisk(String s) {
        return s.replaceAll(s, "*");
    }
}
