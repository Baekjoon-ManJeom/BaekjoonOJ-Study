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

		/*2. 2�� for �� ���*/
		int min = t[0];
		for(int i =0;i<n-1; i++) {		// 1�� �ε������� �ٸ� �ε����� ���ϸ� �ּڰ� �ٲ۴�.
			for(int j =0+i;j<n; j++) {
			if(t[i]>t[j]) {
				
				int temp = 0;
				temp = t[i];
				t[i] = t[j];
				t[j] = temp;
				
			}
		}		
		}
		for(int x : t) {
		System.out.println(x);
		}
	}
		
}
