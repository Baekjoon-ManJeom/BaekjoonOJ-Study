package week3;

import java.util.Scanner;

public class InsertOperator {
	
	public static int max = Integer.MIN_VALUE;	//�ִ� 
	public static int min = Integer.MAX_VALUE;  //�ּڰ�
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
			max = Math.max(max, num); //�ִ� ����
			min = Math.min(min, num); //�ּڰ� ����
			return;
		}
 
		for (int i = 0; i < 4; i++) {
			if (op[i] > 0) { //�������� ������ 1�̻�
				
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
