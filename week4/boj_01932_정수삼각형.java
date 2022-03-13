package boj.level15_동적계획법;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 정수 삼각형
 */
public class boj_01932_정수삼각형 {

    private static Integer[][] dp;
    private static int[][] arr;
    private static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new Integer[n][n];

        for (int i = 0; i < n ; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        // Top-down
        System.out.println(getSumTopDown(0, 0));

        // Bottom-up
        System.out.println(getSumBottomUp(n));
    }

    private static int getSumTopDown(int depth, int col) {

        // Initial Value
        if (depth == n - 1) { // 값이 들어있는 맨 아래행 일 경우 리턴
            return dp[depth][col];
        }

        if (dp[depth][col] == null) { // 메모이제이션 안되어있는 인덱스 일 경우

            // 바로 아래층의 인덱스와 바로 아래층의 오른쪽 인덱스 중 큰 값과 현재 인덱스를 더해줍니다
            dp[depth][col] = Math.max(getSumTopDown(depth + 1, col), getSumTopDown(depth + 1, col + 1)) + arr[depth][col];
        }

        // 메모이제이션 되어있다면 현재 인덱스 값 바로 리턴
        return dp[depth][col];
    }

    private static int getSumBottomUp(int n) {
        for (int i = n - 1; i >= 0; i--) { // 맨 아래행부터
            for (int j = 0; j < i; j++) {
                if (arr[i][j] >= arr[i][j + 1]) { // 좌 우 열 비교
                    arr[i - 1][j] += arr[i][j]; // 위에 행의 열과 더해줍니다
                } else {
                    arr[i - 1][j] += arr[i][j + 1];
                }
            }
        }

        return arr[0][0]; // 연산이 끝나고 나면 꼭대기 인덱스 값 리턴
    }
}
