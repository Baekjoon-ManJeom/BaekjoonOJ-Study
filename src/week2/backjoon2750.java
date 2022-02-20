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

		/*1. 정렬 함수 사용*/
		//		Arrays.sort(t);

		/*2. 2중 for 문 사용*/
		int min = t[0];
		for(int i =0;i<n-1; i++) {		// 1번 인덱스부터 다른 인덱스와 비교하며 최솟값 바꾼다.
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
