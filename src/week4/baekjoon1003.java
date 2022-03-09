package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Top-Bottom(����Լ� ����)*/
//public class baekjoon1003 {
//	static int[][]dp=new int [41][2]; // 0<N<41 , N�� ���� ��µǴ� 0,1������ ������ �迭
//									  // ��α׸� ���� int�� �ƴ� Integer�迭�� �����ϸ� nullüũ�� �� �� �ִٰ� ��.
//	public static void main(String[] args) throws NumberFormatException,  IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());	//�Է� ���� ����
//		
//		//�Ǻ���ġ���� ù°, ��°�� 0,1�� ������ ����
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

		if(dp[n][0]!=0 || dp[n][1]!=0) {	// dp�� n�� �ش��ϴ� ���� �̹� ������ �ٷ� ���
			System.out.println(dp[n][0]+" " +dp[n][1]);
		}
		
		else {
		for(int i =2; i<=n; i++) {		//������ 2���� n���� dp�� �������ش�.
		dp[i][0] = dp[i-1][0] + dp[i-2][0];
		dp[i][1] = dp[i-1][1] + dp[i-2][1];
		}
		System.out.println(dp[n][0]+" " +dp[n][1]);
		}
	}
	

}