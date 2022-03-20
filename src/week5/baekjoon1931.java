package week5;

/*<알고리즘 구현 방법>
 * 1. 종료 시간을 기준으로 오름차순 정렬을 한다.(종료 시간이 빠른순으로 탐색하기 위함이다)
 * 2. if(현재회의 종료 시간 <= 다음회의 시작시간)인 회의를 선택한다.
 * 3. 진행한 회의 수를 counting한다.
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class baekjoon1931 {
	public static int N;
	public static int time[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		time = new int[N][2];
		
		for(int i = 0; i<N; i++) {
			String line = br.readLine();
			time[i][0] = Integer.parseInt(line.split(" ")[0]); //시작시간
			time[i][1] = Integer.parseInt(line.split(" ")[1]); //종료시간
			
		}
		
		
		/////////////이해가 안됨/////////////////
		Arrays.sort(time, new Comparator<int[]>(){
			
			@Override
			public int compare(int[] o1, int[] o2) {
				
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return o1[1] - o2[1];
				
			}
			
		});
		

		int count = 0;
		int prev_time = 0;
		
		for(int i = 0; i<N; i++) {
			if(time[i][0]>=prev_time) {
				count++;
				prev_time = time[i][1];
			}
		}
		System.out.println(count);

	}
	
		

}
