import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
�޸� : 14796kb
�ð� : 136ms
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
		
		// t[i],t[j],t[k]�� �ߺ��� �ε����� ����Ű�� �ʵ��� for���� �����ߴ�.
		for(int i = 0; i<t.length-2;i++) {
			for(int j = 1+i; j<t.length-1;j++) {   
				for(int k = 1+j; k<t.length;k++) {
					if(t[i]+t[j]+t[k] == m) {
						return t[i]+t[j]+t[k];  // 3���� ���� m�� ���ٸ� �� �̻� Ž���� �ʿ䰡 ����.
					}
					
					if(answer<t[i]+t[j]+t[k] && t[i]+t[j]+t[k] <m) {  // ���� Ž���� ���� �� ū ���� ������ answer���� ��ü�Ѵ�
						answer = t[i]+t[j]+t[k];
					}
					
					
				}
			}
		}
		
		return answer;
	}

}
