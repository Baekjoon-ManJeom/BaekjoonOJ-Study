package week1;

import java.util.Scanner;

public class backjoon1436 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		System.out.println(result(n));

		
	}
	static int result(int n) {
		int k = 666; // ���� ���� ���� 666�̹Ƿ� 666���� ����.
		int count = 0;
		
		while(true) {
			String s =Integer.toString(k); // 6�� ���� ���ӵ� ���ڸ� ã������ ���ڿ��� ��ȯ
			if(s.contains("666")) { //666�� ���Ե� ���ڸ� ã�Ƽ� ī��Ʈ
				count++;
			}
			if(n==count) { // �Է¹��� n�� ī��Ʈ�� ���� �������� k�� ��ȯ
				return k;
			}
			k++; //k�� ��� �����Ѵ�.
			}
		
	}
}
