package week1;

import java.util.Scanner;

public class shom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num = 666;
		int count = 1;
		
		while(count < n) {
			num++;
			
			if(String.valueOf(num).contains("666")) { //���ڿ��� 666�� ���� ��
				count++;
			}
		}
		
		System.out.print(num);
		sc.close();
	}
}
