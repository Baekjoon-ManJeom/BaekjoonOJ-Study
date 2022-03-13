package week4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/* ��ȭ��
 * 
 * n��  0Ƚ�� 1Ƚ��
 * 0	1	 0
 * 1	0	 1
 * 2	1	 1
 * 3	1	 2
 * 4	2 	 3
 * 5	3	 5
 * 
 * n�� 0Ƚ�� = n-1�� 0Ƚ�� + n-2�� 0Ƚ��
 * n�� 1Ƚ�� = n-1�� 1Ƚ�� + n-2�� 1Ƚ��
*/


public class Fibonacci {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int t = Integer.parseInt(br.readLine());
 
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int[] zero = new int [41];
		int[] one = new int [41];
		
		zero[0] = 1; //n=0�� �� 0�� Ƚ��
		zero[1] = 0; //n=1�� �� 0�� Ƚ��
		one[0] = 0; //n=0�� �� 1�� Ƚ��
		one[1] = 1; //n=1�� �� 1�� Ƚ��
		
		for(int i = 2; i < 41; i++) {
			zero[i] = zero[i-1] + zero[i-2]; //��ȭ���� �̿��Ͽ� 0�� 1�� Ƚ���� �迭�� ����
			one[i] = one[i-1] + one[i-2];
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println(zero[arr[i]] + " " + one[arr[i]]);
		}

	}

}
