package src.main.java.com.java0812;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        List<Integer> gradeList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("학생 성적 : ");
            int grade = sc.nextInt();
            gradeList.add(grade);

            System.out.println("추가 입력하려면 y : ");
            String answer = sc.nextLine();
            if(!answer.equalsIgnoreCase("y")) break;
        }

        double avg = gradeList.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("학생 인원 : " + gradeList.size());
        System.out.println("평균 점수 : " + avg);

    }
}
