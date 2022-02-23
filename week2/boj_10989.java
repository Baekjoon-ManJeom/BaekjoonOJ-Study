package boj.level12_정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수 정렬하기 3
 * Counting Sort
 * O(n)
 * 
 * 341084 KB
 * 1808 ms
 * 826 B
 */
public class boj_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] cntArr = new int[10001]; // 입력에 주어진 수의 범위 1 ~ 10,000

        for (int i = 0; i < N; i++) {
            cntArr[Integer.parseInt(br.readLine())]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cntArr.length; i++) {
            while (cntArr[i]-- > 0) {
                sb.append(i).append(System.lineSeparator());
            }
        }
        System.out.println(sb);
    }
}
