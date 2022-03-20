package week5;

/*<�˰��� ���� ���>
 * 1. ���� �ð��� �������� �������� ������ �Ѵ�.(���� �ð��� ���������� Ž���ϱ� �����̴�)
 * 2. if(����ȸ�� ���� �ð� <= ����ȸ�� ���۽ð�)�� ȸ�Ǹ� �����Ѵ�.
 * 3. ������ ȸ�� ���� counting�Ѵ�.
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
			time[i][0] = Integer.parseInt(line.split(" ")[0]); //���۽ð�
			time[i][1] = Integer.parseInt(line.split(" ")[1]); //����ð�
			
		}
		
		
		/////////////���ذ� �ȵ�/////////////////
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
