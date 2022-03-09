package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Top-Bottom(재귀함수 구현)*/
//public class baekjoon1003 {
//	static int[][]dp=new int [41][2]; // 0<N<41 , N에 따라 출력되는 0,1개수를 저장할 배열
//									  // 블로그를 보니 int가 아닌 Integer배열로 생성하면 null체크를 할 수 있다고 함.
//	public static void main(String[] args) throws NumberFormatException,  IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());	//입력 받을 개수
//		
//		//피보나치에서 첫째, 둘째는 0,1로 정해져 있음
//		dp[0][0] = 1;
//		dp[0][1] = 0;
//		dp[1][0] = 0;
//		dp[1][1] = 1;
//		
//		
//		for(int i = 0; i<T; i++) {
//			int N =Integer.parseInt(br.readLine());
//			fibonacci(N);	
//			System.out.println(dp[N][0]+" " +dp[N][1]);
//		}
//		
//	}
//	
//	public static int[] fibonacci(int n) {
//
//		if(dp[n][0]==0 && dp[n][1]==0) {
//		
//		
//		dp[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
//		dp[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
//	
//		}
//		return dp[n];
//	}
//	
//
//}

/* Bottom-Up */
public class baekjoon1003 {
	static int[][]dp=new int [41][2]; // 0<N<41
	
	public static void main(String[] args) throws NumberFormatException,  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		dp[0][0] = 1;
		dp[0][1] = 0;
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		
		for(int i = 0; i<T; i++) {
			int N =Integer.parseInt(br.readLine());
			fibonacci(N);			
		}
		
	}
	
	public static void fibonacci(int n) {

		if(dp[n][0]!=0 || dp[n][1]!=0) {	// dp에 n에 해당하는 값이 이미 있으면 바로 출력
			System.out.println(dp[n][0]+" " +dp[n][1]);
		}
		
		else {
		for(int i =2; i<=n; i++) {		//없으먼 2부터 n까지 dp를 정의해준다.
		dp[i][0] = dp[i-1][0] + dp[i-2][0];
		dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		System.out.println(dp[n][0]+" " +dp[n][1]);
		}
	}
	

}