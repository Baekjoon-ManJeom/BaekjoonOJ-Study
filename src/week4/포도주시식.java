package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 포도주시식 {
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new Integer[n+1];
        for (int i = 1; i <= n; i++) arr[i] = Integer.parseInt(br.readLine());
        dp[0] = 0;
        dp[1] = arr[1];
        if(n>=2)
            dp[2] = arr[1] + arr[2];

        System.out.println(func(n));
        br.close();
    }
    /*
    3가지 경우를 비교한다.
    1. f(n-3) + a[n-1] + a[n] -> 2번 연속되더라도 n-3번째까지의 합에서 연속되도록
    2. f(n-2) + a[n]        ->  2번이 연속되지 않도록
    3. f(n-1)               -> 마지막 값을 안뽑는 경우가 더 클수가 있으므로 비교가 필요하다 (생각하기 어렵다)
     */
    static int func(int n){
        if(dp[n] == null)
            return dp[n] = Math.max(Math.max(func(n-3) + arr[n-1]+ arr[n], func(n-2) + arr[n]),func(n-1));
        return dp[n];
    }
}
