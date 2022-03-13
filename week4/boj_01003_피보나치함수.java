package boj.level15_동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 피보나치 함수
 */
public class boj_01003_피보나치함수 {

    private static int n;
    private static int zero;
    private static int one;
    private static int zeroPlusOne;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            fibonacci(n);
            System.out.println(zero + " " + one);
        }
    }

    private static void fibonacci(int n) {
        zero = 1;
        one = 0;
        zeroPlusOne = 1;

        for (int i = 0; i < n; i++) {

            /* N(0) N(1) count
                1   0
                0   1
                1   1
                1   2
                2   3
                3   5
                5   8
                8   13
             */
            zero = one;
            one = zeroPlusOne;
            zeroPlusOne = zero + one;
        }
    }
}
