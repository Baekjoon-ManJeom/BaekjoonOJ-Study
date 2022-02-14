import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backjoon7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int n = Integer.parseInt(line);
		int []kg = new int [n];
		int []ht = new int [n];
		for(int i = 0; i<n;i++) {
			line = br.readLine();
			kg[i] = Integer.parseInt(line.split(" ")[0]);
			ht[i] = Integer.parseInt(line.split(" ")[1]);
		}
		int [] result = dungchi(n,kg,ht);
		for(int i : result) {
			System.out.printf(i+ " ");
		}

	}
	
	static int[] dungchi(int n , int[]kg, int[]ht) {
		int []result = new int [n];
		int count = 1;
		
		// i��° ����� �������� j��° ����� �񱳸� �Ѵ�.
		for(int i=0; i<n; i++) { 
			for(int j=0; j<n; j++) {
				if(kg[i]<kg[j] && ht[i]<ht[j]) { //�����Կ� Ű�� ��� ���̳��� ���� ����� �з�����.
					count++;
				}
				
			}
			result[i] = count; //i���� ����� ����� �迭�� ����.
			count = 1;
		}
		
		
		return result;
	}

}
