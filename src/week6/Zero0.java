package week6;

import java.util.Scanner;
import java.util.Stack;

public class Zero0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       int n= sc.nextInt();

	       Stack<Integer> st =new Stack<>();
	       int sum=0;

	       for(int i=0; i<n; i++){
	           int k = sc.nextInt();
	           
	           if(k > 0) { //정수가 0보다 클 때 push
	        	   st.push(k);
	           }
	           else { 
	               if(!st.isEmpty()) { //정수가 0일 때 비어있지 않다면 pop
	                   st.pop();
	               }
	               else
	                   continue;
	           }
	       }

	       while(!st.isEmpty()){
	           sum += st.pop(); //스택에 남은 값을 더하여 합계 출력
	       }
	       
	       System.out.println(sum);
	       sc.close();
	}

}
