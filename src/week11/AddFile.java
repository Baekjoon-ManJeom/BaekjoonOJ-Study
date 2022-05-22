package week11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AddFile {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st = null;

	public static void main(String[] args) throws Exception {
		int t;

        t = Integer.parseInt(br.readLine());
        for (int tc = 0; tc < t; tc++) {
            int k;
            int[] novel;
            int[] sum;
            int[][] dp;

            k = Integer.parseInt(br.readLine());
            novel = new int[k + 1];
            dp = new int[k + 1][k + 1];
            sum = new int[k + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= k; i++) {
                novel[i] = Integer.parseInt(st.nextToken()); //각 장
                sum[i] = sum[i - 1] + novel[i]; //각 장을 더한 배열
            }

            for (int gap = 1; gap < k; gap++) {
                for (int start = 1; start + gap <= k; start++) {
                    int end = start + gap;
                    dp[start][end] = Integer.MAX_VALUE;
                    for (int mid = start; mid < end; mid++) {
                        dp[start][end] = Math.min(dp[start][end], dp[start][mid] + dp[mid + 1][end] + sum[end] - sum[start - 1]);
                    }
                }
            }
            System.out.println(dp[1][k]);
        }
	}

}
