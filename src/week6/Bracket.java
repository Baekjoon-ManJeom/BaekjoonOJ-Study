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
			
			if (c == '(') { // 여는 괄호일 때 push
				stack.push(c);
			}
 
			//c == ')'
			//닫는 괄호일 때 pop
			else if (!stack.empty()) {
				stack.pop();
			}
			//닫는 괄호일 때 pop할 정수가 없을 경우
			else if(c == ')'){
				return "NO";
			}
		}
 
		if (stack.empty()) { //검사 이후 스택이 비어 있으면 "YES"
			return "YES";
		} 
		else {  //검사 이후 스택에 잔여 요소가 있으면 "NO"
			return "NO";
		}
	}
}
