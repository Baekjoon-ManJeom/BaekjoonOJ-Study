package week5;

import java.util.Arrays;
import java.util.Scanner;


public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] pArr = new int[N];
		
		for(int i=0; i<N; i++) {
			pArr[i] = sc.nextInt();
		}
		
		Arrays.sort(pArr); //빠른 시간 순서대로 정렬
		
		int sum = 0;
		int wait = 0;
		
		for(int i=0; i<N; i++) {
			wait += pArr[i];
			sum += wait;
		}
		
		System.out.println(sum);
		sc.close();
	}

}
