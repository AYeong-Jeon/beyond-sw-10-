package src.main.java.com.java0812;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> urlList = new LinkedList<>();

        while(true) {
            System.out.println("방문 URL을 입력하세요. (단, exit를 입력하면 종료)");
            String url = sc.nextLine();

            if(url.equalsIgnoreCase("exit")) break;

            urlList.addFirst(url);
            if (urlList.size() > 5) {
                urlList.removeLast();
            }
            System.out.println("최근 방문 url : "+urlList);
        }



    }
}
