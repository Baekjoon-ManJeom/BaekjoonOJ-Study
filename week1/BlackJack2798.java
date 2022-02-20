package src.java.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackJack2798 {
    public static void main(String args[]) throws IOException {

        /*
        BufferdReader 사용법 익히자.
        StringTokenizer 도 익혀야한다.
        기훈님의 입력방법 참고함. 어레이열의 mapToInt 체크해보자.

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        int [] list;

        list = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumValue = 0;
        int maxValue = 0;
        for(int i = 0 ; i< n; i++ ){

            sumValue = list[i];
            for(int j = i+1; j< n; j++){
                sumValue = sumValue + list[j];
                for(int k = j+1; k< n ; k++){
                    sumValue = sumValue + list[k];

                    if( sumValue <= m){
                        maxValue = Math.max(sumValue, maxValue);
                    }
                    sumValue = list[i] + list[j];
                }
                sumValue = list[i];
            }
            sumValue = 0;
        }
    System.out.println(maxValue);


    }
}
