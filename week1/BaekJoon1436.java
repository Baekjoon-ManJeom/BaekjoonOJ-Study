package src.java.week1;

import java.util.Scanner;

public class BaekJoon1436 {
    public static void main(String args[]) throws Exception{
        Scanner scanner = new Scanner(System.in);

        //입력받은 값 처리
        int n = scanner.nextInt();
        scanner.close();
        int endNumber = 666;
        int point = 0;
        String checkValue ;
        //666 이 있으면서 제일 작은수대로 영화의 번호이다. 666 = 1번째 1666 은 2번째 .... 10번째는 9666 11번째 10666 11666 12666 ... 16660 16661 이렇게 진행된다.
        while (true){
            checkValue = Integer.toString(endNumber);
            if(checkValue.contains("666")){
                point++;

            }
            if(point == n) {
                System.out.println(endNumber);
                break;
            }
            endNumber++;
            }

    }
}
