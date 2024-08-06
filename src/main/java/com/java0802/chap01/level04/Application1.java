package src.main.java.com.java0802.chap01.level04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i=0 ; i<6 ; i++) {
            int num = (int) (Math.random() * 45) + 1;
            if(!list.contains(num)) {
                list.add(num);
            }
        }

        System.out.println(Arrays.toString(list.stream().sorted().toArray()));
    }
}
