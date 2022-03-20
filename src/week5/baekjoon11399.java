package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*<�˰��� ���� ���>
 * 1. ���ð��� ������ ���ϴ� �����̹Ƿ� ���ð��� ���̴� ���� ����
 * 2. ���� �ð��� ª�� ������� ���� �̿��ؾ� ���ð��� ª������.
 * 3. �迭�� ���� �������� ����
 * 4. �ջ���� ������ ����ŭ ���ð��� �����ǹǷ� '���� ��� ���ð�'�� '����� ���ð� ����'�� ������ �д�.
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
			//i���� ����� ���ð� 
			Time +=M[i];
			
			//0~i��° ������� ����� ���ð� ����
			Sum += Time;

		}
		System.out.println(Sum);

		
	}

}
