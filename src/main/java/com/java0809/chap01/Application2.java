package src.main.java.com.java0809.chap01;

public class Application2 {
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
        System.out.println("String 합계 : " + sum(strArray));
    }
}
