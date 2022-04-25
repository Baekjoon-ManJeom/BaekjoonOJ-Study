package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {
    static int[][] cost;
    static int[][] DP;
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        // DP - 3가지 경우로 메모이제이션!
        // 마지막이 red, green, blue 를 각각 선택한 경우들을
        // 뒤에서 역으로 최소선택을 추적해가도록 백트래킹

        DP = new int[n][3];
        DP[0][0] = cost[0][0];
        DP[0][1] = cost[0][1];
        DP[0][2] = cost[0][2];
        int res = Math.min(record_cost(n-1,0), Math.min(record_cost(n-1,1), record_cost(n-1,2)));
        System.out.println(res);
    }
    static int record_cost(int i, int j){
        int a = (j+1) % 3;
        int b = (j+2) % 3;
        if(DP[i][j]==0)
            DP[i][j] = cost[i][j] + Math.min(record_cost(i-1,a), record_cost(i-1,b));
        return DP[i][j];
    }
}
