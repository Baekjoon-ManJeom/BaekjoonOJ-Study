package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * �޸�: 	14268KB
	�ð�: 	316ms
*/
public class beakjoon11047 {
	static int[] coin;
	static int N;
	static int cnt;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		N = Integer.parseInt(line.split(" ")[0]);
		int K = Integer.parseInt(line.split(" ")[1]);
		coin = new int[N];
		for(int i = 0; i<N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
			
		}
		
		greedy(K);
		System.out.println(cnt);
		
	}
	
	public static void greedy(int K) {
		
		if(K==0) return;
		while(K>0) {
			for(int i = N-1; i>=0; i--) {
				if(K>=coin[i] ) {
					cnt++;
					K-=coin[i];
					break;
				}

			}
		}
		
	}

}
/*<��α� ����>
�޸�: 	14296KB
�ð�: 	128ms  
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coin = new int[N];
		
		for(int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;
 
		for(int i = N - 1; i >= 0; i--) {
 
			// ���� ������ ��ġ�� K���� �۰ų� ���ƾ��� ���������ϴ�.
			if(coin[i] <= K) {
				// ���� ��ġ�� �������� ������ �� �ִ� ������ �����ش�.
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
	}
 
}
 * 
 * 
 * */
