package week1;

import java.util.Scanner;

public class backjoon1436 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		System.out.println(result(n));

		
	}
	static int result(int n) {
		int k = 666; // 제일 작은 수는 666이므로 666부터 시작.
		int count = 0;
		
		while(true) {
			String s =Integer.toString(k); // 6이 세번 연속된 숫자를 찾기위해 문자열로 변환
			if(s.contains("666")) { //666이 포함된 숫자를 찾아서 카운트
				count++;
			}
			if(n==count) { // 입력받은 n과 카운트된 수가 같아지면 k를 반환
				return k;
			}
			k++; //k는 계속 증가한다.
			}
		
	}
}
