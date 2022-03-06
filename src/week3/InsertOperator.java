package week3;

import java.util.Scanner;

public class InsertOperator {
	
	public static int max = Integer.MIN_VALUE;	//최댓값 
	public static int min = Integer.MAX_VALUE;  //최솟값
	public static int []arr;
	public static int []op = new int[4];
	public static int n;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		n = sc.nextInt();
		
		arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<4; i++) {
			op[i] = sc.nextInt();
		}
		
		sc.close();

		dfs(arr[0], 1);
		
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void dfs(int num, int index) {
		if (index == n) {
			max = Math.max(max, num); //최댓값 저장
			min = Math.min(min, num); //최솟값 저장
			return;
		}
 
		for (int i = 0; i < 4; i++) {
			if (op[i] > 0) { //연산자의 개수가 1이상
				
				op[i]--;
				 
				switch (i) {
 
				case 0:	dfs(num + arr[index], index + 1);	break;
				case 1:	dfs(num - arr[index], index + 1);	break;
				case 2:	dfs(num * arr[index], index + 1);	break;
				case 3:	dfs(num / arr[index], index + 1);	break;
 
				}
				
				op[i]++;
				
			}
		}
	}
}
