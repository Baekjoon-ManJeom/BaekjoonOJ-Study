import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
메모리 : 14796kb
시간 : 136ms
 */

public class backjoon2798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line.split(" ")[0]);
		int m = Integer.parseInt(line.split(" ")[1]);
		int []t = new int[n];
		line = br.readLine();
		for(int i=0 ; i<n; i++) {
			t[i]=Integer.parseInt(line.split(" ")[i]);
		}
		
		int result = result(t, n, m);
		System.out.println(result);
		
	}
	static int result(int[] t, int n, int m) {
		int answer = 0;
		
		// t[i],t[j],t[k]가 중복된 인덱스를 가리키지 않도록 for문을 구성했다.
		for(int i = 0; i<t.length-2;i++) {
			for(int j = 1+i; j<t.length-1;j++) {   
				for(int k = 1+j; k<t.length;k++) {
					if(t[i]+t[j]+t[k] == m) {
						return t[i]+t[j]+t[k];  // 3수의 합이 m과 같다면 더 이상 탐색할 필요가 없다.
					}
					
					if(answer<t[i]+t[j]+t[k] && t[i]+t[j]+t[k] <m) {  // 완전 탐색을 통해 더 큰 값이 나오면 answer값을 교체한다
						answer = t[i]+t[j]+t[k];
					}
					
					
				}
			}
		}
		
		return answer;
	}

}
