package src.main.java.com.java0731.chap02.level02;

public class Application {
    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker();

        // 첫 번째 인자의 최소값부터 두 번째 인자까지 범위의 난수를 출력
        System.out.println(randomMaker.randomNumber(-50, 50));

        // 인자로 전달한 정수 길이의 랜덤한 문자열을 출력
        System.out.println(randomMaker.randomUpperAlphabet(10));

        // 가위, 바위, 보 중 한 가지를 출력
        System.out.println(randomMaker.rockPaperScissors());

        // 앞면, 뒷면 중 한 가지를 출력
        System.out.println(randomMaker.tossCoin());
    }

}
