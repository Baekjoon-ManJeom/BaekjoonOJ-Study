package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*<알고리즘 구현 방법>
 * 1. 데크 생성 
 * 2. 수행할 함수 문자열과, 대괄호로 입력받은 배열에서 수를 추출하여 데크에 입력 후,
 * 3. 함수 AC에서 연산을 진행
 * 4. 함수 Print에서 결과값을 출력
 * 
 * 
 * */

public class beakjoon5430 {

	static StringBuilder sb = new StringBuilder();
	static 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Deque<Integer> q;
		StringTokenizer st ;

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {

			String func = br.readLine();
			int n = Integer.parseInt(br.readLine());

			String array = br.readLine();

			st = new StringTokenizer(array, "[],"); // 대괄호와 쉼표를 빼고 값만 추출
			
			q = new ArrayDeque<Integer>();
			
			for(int j = 0; j<n;j++) {
				q.offer(Integer.parseInt(st.nextToken())); //데크에 값을 저장
			}
			
			AC(func,q); //연산할 함수 문자열과 데크를 파라미터로 넘김

		}
		
		System.out.println(sb);
		
	}
	public static void AC(String func, Deque<Integer> q) {
		
		boolean isRight = true;


		for(char cmd : func.toCharArray()) {
			
			// R일 경우
			if(cmd =='R') {				// R : boolean 변수를 통해 true면 0번째 인덱스가 front, false면 마지막 인덱스가 front
				isRight = !isRight;
				continue;
			}

			// D일 경우
			if(isRight) {
				
				if(q.pollFirst() == null ) {	//정방향이므로 0번째 인덱스 제거
					sb.append("error\n");
					return;
				}
				
			}
			else {
				if(q.pollLast() == null ) {		//역방향이므로 마지막 인덱스 제거
					sb.append("error\n");
					return;
				}
			}

		}



		Print(isRight, q);	// boolean값과 데크를 출력 함수로 넘김
	}
	public static void Print (boolean isRight, Deque<Integer> q) {



		sb.append('[');
		
		if(q.size() > 0) {
			
		
		if(isRight) {	//정방향 이므로 0번쨰 인덱스부터 차례대로 출력
			sb.append(q.pollFirst());
			while(!q.isEmpty()) {
				sb.append(',').append(q.pollFirst());
			}
		}
		else {			//역방향 이므로 마지막 인덱스부터 차례대로 출력
			sb.append(q.pollLast());
			while(!q.isEmpty()) {
				sb.append(',').append(q.pollLast());
			}
		}
		}
		sb.append(']').append('\n');

	}
}