package src.main.java.com.java0802.chap02.level01;

public class Application1 {
    public static void main(String[] args) {
        int[][] numArr = new int[3][4];

        int num = 1;
        for (int i=0 ; i<numArr.length ; i++) {
            for(int j=0 ; j<numArr[i].length ; j++) {
                numArr[i][j] = num++;
            }
        }

        for (int i=0 ; i<numArr.length ; i++) {
            for(int j=0 ; j<numArr[i].length ; j++) {
                System.out.print(numArr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
