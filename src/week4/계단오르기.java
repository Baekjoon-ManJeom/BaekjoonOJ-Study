package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {
    //Integer 배열은 초기값이 null이므로 활용
    static int[] cost;
    static Integer[] DP;
    public static void main(String[] args) throws IOException {
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        cost = new int[n+1];
        // 1번 부터 셋팅 (0번째는 null이 아닌 0을 가져야함)
        for (int i = 1; i <= n; i++)
            cost[i] = Integer.parseInt(br.readLine());
        br.close();
        // DP
        DP = new Integer[n+1];
        DP[0] = cost[0];
        DP[1] = cost[1];
        DP[2] = cost[1]+ cost[2];
        System.out.println(record_cost(n));
    }
    static int record_cost(int n){
        // (n-3 + n-1 + n)을 밟는 경우와 (n-2 + n)을 경우를 비교 = 연속 두번까지만 밟게 방어
        if(DP[n]==null)
            DP[n] = cost[n] + Math.max(record_cost(n-2), record_cost(n-3) + cost[n-1]);
        return DP[n];
    }
}
