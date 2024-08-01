package src.main.java.com.java0731.chap02.level01;

public class Application {
    public static void main(String[] args) {

        /*
        * 메소드 호출 확인
        1부터 10까지의 합 : 55
        두 수 중 큰 수는 20이다.
        10과 20의 합은 : 30
        10과 5의 차는 : 5
        * */

        Calculator calculator = new Calculator();

        calculator.checkMethod();
        System.out.println(("1부터 10까지의 합 : " + calculator.sum1to10()));
        calculator.checkMaxNumber(10, 20);
        System.out.println("10과 20의 합은 : "+calculator.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차는 : " + calculator.minusTwoNumber(10, 5));
    }
}
