package week2;
import java.util.Arrays;
import java.util.Scanner;

public class backjoon2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []t = new int[n];
		for(int i = 0; i<n ; i++) {
			t[i]=in.nextInt();
		}

		/*1. ���� �Լ� ���*/
		//		Arrays.sort(t);

		/*2. ���� ���� */
//		int min = t[0];
//		for(int i =0;i<n-1; i++) {		// 1�� �ε������� �ٸ� �ε����� ���ϸ� �ּڰ� �ٲ۴�.
//			for(int j =0+i;j<n; j++) {
//			if(t[i]>t[j]) {
//				
//				int temp = 0;
//				temp = t[i];
//				t[i] = t[j];
//				t[j] = temp;
//				
//			}
//		}		
//		}
		/* 3. ���� ���� */
		
//		for(int i =1;i<n; i++) {		
//			int tg = t[i];			// 2��° �ε������� ������ ��´�
//			int j = i - 1;
//			
//			while(j>=0 && tg<t[j]) {	// Ÿ���� �������� ������ ���� �ε������� ������� ���ϸ�  
//				t[j+1] = t[j];			//���� ���Ұ� �� ũ�� Ÿ���� ���ʿ� �����ϰ� �������� ���������� �о��.
//				j--;
//			}
//		
//			t[j+1] = tg;		// while�� Ż�������� j�� 0�̰ų�, Ÿ�ٺ��� �۴ٴ� �ǹ��̴�.
//								// ���� Ÿ���� j+1��°�� �;��Ѵ�.
//		}
	
		/* 4. ���� ���� */
		for(int j = n; j>1; j--) {
			for(int i =0;i<n-1; i++) {	
				if(t[i]>t[i+1]) {			//������ �μ��� ���� �ڸ��� �ٲ۴�.
					int temp = t[i+1];		//�� ����Ŭ���� �ִ��� �����ȴ�
					t[i+1] =t[i];
					t[i] = temp;
				}
			}
		}
		for(int x : t) {
		System.out.println(x);
		}
	}
		
}
