package week4;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class baekjoon12865 {
//	static int N;
//	static int K;
//	static int Max = Integer.MIN_VALUE;
//		static boolean visit[];
//	static int Things[][];
//
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String line = br.readLine();
//		StringTokenizer st = new StringTokenizer(line, " ");
//		N = Integer.parseInt(st.nextToken());
//		K = Integer.parseInt(st.nextToken());
//		Things = new int [N][2];
//		visit= new boolean[N];
//
//		//		System.out.println(Arrays.deepToString(Things));
//		for(int i =0; i<N; i++) {
//			line = br.readLine();
//			st = new StringTokenizer(line, " ");
//			Things[i][0] = Integer.parseInt(st.nextToken());
//			Things[i][1] = Integer.parseInt(st.nextToken());
//		}
//
//		dp(0,0);
//		System.out.println(Max);
//
//	}
//	public static void dp(int ks, int vs) {
//
//
//
//		for(int i = 0; i<N; i++) {
//			if(!visit[i]) {
//				if(ks+Things[i][0]<=K) {
//					visit[i] = true;
//					Max = Math.max(Max,vs+Things[i][1]);
//					dp(ks+Things[i][0],vs+Things[i][1]);
//
//					visit[i] = false;
//				}
//			}
//
//		}
//
//
//	}
//
//}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
/* <�˰��� ���� ���>
 * 1. ���Ǻ� ���� �� ��ġ�� ������ �޸������̼��� �� dp�迭�� �����.
 * 2. dp[i][j] - j�� �����ѵ� ������ i��° ���Ǳ��� Ž������ �� ������ �ִ� ��ġ�� ����
 * 		 - �� ��� :2-1. if( i���� ���� ����> j) dp[i][j] = dp[i-1][j]
 * 					2-2. else dp[i][j] = max(dp[i-1][j], v[i]+ dp[i-1][j-i ���� ����])
 * 3. dp[N][K] �� �ִ��� �ȴ�.
 * 
 * */

public class baekjoon12865 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
 
		int[] W = new int[N + 1]; // ����
		int[] V = new int[N + 1]; // ��ġ
		int[][] dp = new int[N + 1][K + 1];  //dp - �� : ������ �� �ִ� �ִ� ����
											 // 	�� : ~���� Ž������ �� �ִ� ��ġ 
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}
 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				
				// i��° ���Ը� �� ���� �� ���� ��� 
				if(W[i] > j) {
					dp[i][j] = dp[i - 1][j];
				}
				// i��° ���Ը� �� ���� �� �ִ� ��� 
				else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
				}
				
			}
		}
		System.out.println(dp[0][0]);
		System.out.println(dp[N][K]);
	}
}