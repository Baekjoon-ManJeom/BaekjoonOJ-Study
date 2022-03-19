package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 메모리: 	14268KB
	시간: 	316ms
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
/*<블로그 참고>
메모리: 	14296KB
시간: 	128ms  
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
 
			// 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
			if(coin[i] <= K) {
				// 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
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
