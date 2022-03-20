package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*<알고리즘 구현 방법>
 * 1. 대기시간의 총합을 구하는 문제이므로 대기시간을 줄이는 것이 관건
 * 2. 인출 시간이 짧은 사람부터 먼저 이용해야 대기시간이 짧아진다.
 * 3. 배열을 오름 차순으로 정렬
 * 4. 앞사람이 업무를 본만큼 대기시간은 누적되므로 '현재 사람 대기시간'과 '사람별 대기시간 총합'을 변수로 둔다.
 * 
 * */


public class baekjoon11399 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M[] = new int[N]; 
		int Time = 0; 
		int Sum = 0; 
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		for(int i = 0 ; i<N; i++) {			
			M[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(M);

		
		for(int i = 0 ; i<N; i++) {
			//i번쨰 사람의 대기시간 
			Time +=M[i];
			
			//0~i번째 사람까지 사람별 대기시간 총합
			Sum += Time;

		}
		System.out.println(Sum);

		
	}

}
