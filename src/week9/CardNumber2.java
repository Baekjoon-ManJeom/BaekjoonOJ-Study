package week9;

import java.util.Arrays;
import java.util.Scanner;

public class CardNumber2 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int key = sc.nextInt();
 
			sb.append(UpperBound(arr, key) - lowerBound(arr, key)).append(' ');
		}
		System.out.println(sb);
		
		sc.close();
	}
	
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
 
			int mid = (lo + hi) / 2;
 
			//값이 중간 위치의 값보다 작거나 같을 때
			if (key <= arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}

	private static int UpperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
 
			int mid = (lo + hi) / 2;
 
			//값이 중간 위치의 값보다 작을 때
			if (key < arr[mid]) {
				hi = mid;
			}
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;
	}

}
