package src.main.java.com.java0812;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Map<String, String> phoneMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;

            if(input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String name = scanner.nextLine();
                String phone = phoneMap.get(name);
                if(phone != null) {
                    System.out.println(name + "씨의 전화번호 : " + phone);
                } else {
                    System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            } else {
                String[] result = input.split(" ");
                if(result.length > 1) {
                    phoneMap.put(result[0], result[1]);
                    System.out.println("추가 완료 : " + result[0] + " " + result[1]);
                } else {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
            }
        }
    }
}
