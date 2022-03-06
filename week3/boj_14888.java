package boj.level14_백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기
 *
 * 15764 KB
 * 140 ms
 * 2026 B
 */
public class boj_14888 {

    private static int N;
    private static int[] num;
    private static int[] operator = new int[4];
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        num = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(num[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void dfs(int sum, int idx) {

        // Base condition
        if (idx == N) {
            calc(sum);
            return;
        }

        for (int i = 0; i < 4; i++) { // 부호를 한번씩 돌리기 위한 반복문
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0:
                        dfs(sum + num[idx], idx + 1);
                        break;
                    case 1:
                        dfs(sum - num[idx], idx + 1);
                        break;
                    case 2:
                        dfs(sum * num[idx], idx + 1);
                        break;
                    case 3:
                        dfs(sum / num[idx], idx + 1);
                        break;
                }
                operator[i]++;
            }
        }
    }

    private static void calc(int sum) {
        min = Math.min(min, sum);
        max = Math.max(max, sum);
    }
}
