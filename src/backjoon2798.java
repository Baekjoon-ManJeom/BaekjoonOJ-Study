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
		
		
		for(int i = 0; i<t.length-2;i++) {
			for(int j = 1+i; j<t.length-1;j++) {
				for(int k = 1+j; k<t.length;k++) {

					
					if(answer<t[i]+t[j]+t[k] && t[i]+t[j]+t[k] <=m) {
						answer = t[i]+t[j]+t[k];
					}
					
					
				}
			}
		}
		
		return answer;
	}

}
