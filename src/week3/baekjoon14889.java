package week3;
/* <�˰��� ���� ����>
1. N�� �߿��� N/2���� ���� ���� �˰����� ����Ͽ� ����
2. combination()�Լ��� N���� �������� N/2���� ������ �����ϴ� ��� ����� ���� ã�Ƽ�, �� ����� ������
	boolean visit[] �迭�� üũ�Ͽ� Start(),Link()�Լ��� �����Ѵ�.
3. Start()�� visit�� true��, Link()�� false�� üũ�� ���� ã�Ƽ� �ɷ�ġ�� ����Ѵ�.
4. Start()�� Link()�� ���� �ɷ�ġ�� �ջ��� ���� �����Ѵ�.
5. combination()���� ���Ϲ��� ���� ���̸� �����Ͽ� �ּڰ��� �����Ѵ�.

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
			Player[i] = i;		// ������ ��ȣ�� 0~N-1 ���� ���� 
			String line = br.readLine();
			StringTokenizer stk  = new StringTokenizer(line, " ");
			for(int j = 0; j<N; j++) {
				S[i][j] =Integer.parseInt(stk.nextToken());
			}
		}
		
		//2. N���� ����� N/2�� ���� ���� �����Ǵ� ��� ����� �� �ľ�
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
			dif = Math.abs(Start-Link);	// Start�� Link�� �ɷ�ġ ���̸� ���
			if(Min>dif) Min = dif; 	// ��� ����� ������ �ɷ�ġ ������ �ּڰ��� ã��.
			return;
		}
		
		for(int i=start ; i<n; i++ ) { // ��Ʈ��ŷ�� ����� true,false�� ���� ����
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
			if(visit[i]&&visit[j]) {	//n������ 2���� �̴� ����� �� ��, visit�� true �� ��츸 �ɷ�ġ�� ���
				
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
			if(!visit[i]&&!visit[j]) { //n������ 2���� �̴� ����� �� ��, visit�� false �� ��츸 �ɷ�ġ�� ���
				
					Sum += S[Player[i]][Player[j]]+S[Player[j]][Player[i]];
				}
			}
		}
		 return Sum ;
	}
	
}
