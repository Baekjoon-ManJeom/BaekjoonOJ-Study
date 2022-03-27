package week6;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			System.out.println(vpsIs(sc.next()));
		}
		
		sc.close();
	}
	
	public static String vpsIs(String s) {
		 
		Stack<Character> stack = new Stack<>();
 
		for (int i = 0; i < s.length(); i++) {
 
			char c = s.charAt(i);
			
			if (c == '(') { // ���� ��ȣ�� �� push
				stack.push(c);
			}
 
			//c == ')'
			//�ݴ� ��ȣ�� �� pop
			else if (!stack.empty()) {
				stack.pop();
			}
			//�ݴ� ��ȣ�� �� pop�� ������ ���� ���
			else if(c == ')'){
				return "NO";
			}
		}
 
		if (stack.empty()) { //�˻� ���� ������ ��� ������ "YES"
			return "YES";
		} 
		else {  //�˻� ���� ���ÿ� �ܿ� ��Ұ� ������ "NO"
			return "NO";
		}
	}
}
