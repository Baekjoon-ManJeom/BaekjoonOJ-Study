package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon1932 {
		public static int [][]Triangle;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Triangle = new int [N][N];
		int dp[][] = new int [N][N];
		for(int i=0; i<N; i++ ) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			for(int j=0; j<N; j++ ) {
				if(st.hasMoreTokens()==false) continue;
				else Triangle[i][j] = Integer.parseInt(st.nextToken());			
			}
		}
		

		System.arraycopy(Triangle[N-1], 0, dp[N-1], 0, N);
		
		for(int i=N-1; i>0; i-- ) {
			for(int j=0; j<N-1; j++) {
			dp[i-1][j]=Triangle[i-1][j]+Math.max(dp[i][j],dp[i][j+1]);
				
			}
		}

//		System.out.println(Arrays.deepToString(Triangle));
//		System.out.println(Arrays.deepToString(dp));
		System.out.println(dp[0][0]);
	}
	


}
