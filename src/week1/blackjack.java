package week1;

import java.util.Scanner;

public class blackjack {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int []arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = 0; //���� ī�� ���� ��(���)

		for(int i=0; i<n-2; i++) {
			
			for(int j=i+1; j<n-1; j++) {
				
				for(int k=j+1; k<n; k++) {
					int sum = arr[i]+arr[j]+arr[k]; //���� ī�� ���� ��
					
					if(m==sum) { //���� m�� ���� ��
						System.out.println(sum);
						return;
					}
					if(result<sum && sum<m) { //���� m���� �۰�, ���� �պ��� Ŭ ��
						result = sum;
					}
				}
			}
		}
		System.out.println(result);
		sc.close();
	}

}
