package week3;
/* <알고리즘 구현 순서>
1. N개 중에서 N/2개를 고르는 조합 알고리즘을 기반하여 구성
2. combination()함수는 N명의 선수에서 N/2명의 선수를 선택하는 모든 경우의 수를 찾아서, 그 경우의 수마다
	boolean visit[] 배열에 체크하여 Start(),Link()함수로 전달한다.
3. Start()는 visit이 true로, Link()는 false로 체크된 수만 찾아서 능력치를 계산한다.
4. Start()와 Link()는 각자 능력치를 합산한 값을 리턴한다.
5. combination()에서 리턴받은 값의 차이를 도출하여 최솟값을 도출한다.

 *  */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

 
public class baekjoon14889 {
	public static int[][]S;
	public static int[]Player;
	public static int Min = Integer.MAX_VALUE;
	public static int Sum ;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean []visit = new boolean [N]; 
		Player = new int[N];
		
		
		S = new int [N][N];
		for(int i = 0; i<N; i++) {
			Player[i] = i;		// 선수의 번호는 0~N-1 으로 설정 
			String line = br.readLine();
			StringTokenizer stk  = new StringTokenizer(line, " ");
			for(int j = 0; j<N; j++) {
				S[i][j] =Integer.parseInt(stk.nextToken());
			}
		}
		
		//2. N명의 사람을 N/2명씩 나눠 팀이 구성되는 모든 경우의 수 파악
		combination(visit,0,N,N/2);
		System.out.println(Min);
		
		

	}
	static void combination (boolean []visit, int start, int n , int r) {
		int Start = 0;
		int Link = 0;
		int dif = 0;
		if( r==0 ) {

			Start = Start(visit,n);
			Link = Link(visit,n);
			dif = Math.abs(Start-Link);	// Start와 Link의 능력치 차이를 계산
			if(Min>dif) Min = dif; 	// 모든 경우의 수에서 능력치 차이의 최솟값을 찾음.
			return;
		}
		
		for(int i=start ; i<n; i++ ) { // 백트래킹을 사용해 true,false로 팀을 구별
			if(!visit[i]) {
			visit[i] = true;
			combination(visit,i+1,n,r-1);
			visit[i] = false;
			}
		}
		
	}
	static int Start(boolean[]visit, int n ) {
		int Sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
			if(visit[i]&&visit[j]) {	//n개에서 2명을 뽑는 경우의 수 중, visit이 true 인 경우만 능력치를 계산
				
					Sum += S[Player[i]][Player[j]]+S[Player[j]][Player[i]];
				}
			}
		}
		 return Sum ;
	}
	
	static int Link(boolean[]visit, int n ) {
		int Sum = 0;
		for(int i = 0; i<n; i++) {
			for(int j = i+1; j<n; j++) {
			if(!visit[i]&&!visit[j]) { //n개에서 2명을 뽑는 경우의 수 중, visit이 false 인 경우만 능력치를 계산
				
					Sum += S[Player[i]][Player[j]]+S[Player[j]][Player[i]];
				}
			}
		}
		 return Sum ;
	}
	
}
