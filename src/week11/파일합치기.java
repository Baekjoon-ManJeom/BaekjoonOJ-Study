package week11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 파일합치기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            // input
            int K = Integer.parseInt(br.readLine());
            int[] arr = new int[K + 1]; // 입력배열
            int[] sum = new int[K + 1]; // 합계 배열
            int[][] dp = new int[502][502]; // 최대값 범위내 배열
            int[][] kk = new int[502][502]; // Knuth 최적화를 쓰기 위해 점화식 형태를 맞춰주기 위함.

            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int i = 1; i <= K; i++) {
                 arr[i] = Integer.parseInt(st.nextToken());
                 sum[i] = sum[i - 1] + arr[i];
                 kk[i - 1][i] = i;
            }

            // DP 최적화 기법 중 하나인 Knuth Optimization을 사용한 코드 O(N^2)
            for (int j = 2; j <= K; j++) {
                for (int i = 0; i+j <= K; i++) {
                    int d = i+j; // 각각의 자리의 경우의 수를 모두 순회하기 위한 설정
                    dp[i][d] = Integer.MAX_VALUE; // 최대값으로 초기화한 후 최솟값을 셋팅함
                    for (int k = kk[i][d - 1]; k <= kk[i + 1][d]; k++) { // k는  뭐지? 진짜 모르겠다.;;
                        int v = dp[i][k] + dp[k][d] + (sum[d] - sum[i]);
                        if (dp[i][d] > v) {
                            dp[i][d] = v;
                            kk[i][d] = k;
                        }
                    }
                }
            }
            sb.append(dp[0][K]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
