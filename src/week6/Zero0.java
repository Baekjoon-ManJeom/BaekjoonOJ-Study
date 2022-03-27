package week6;

import java.util.Scanner;
import java.util.Stack;

public class Zero0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       int n= sc.nextInt();

	       Stack<Integer> st =new Stack<>();
	       long sum=0;

	       for(int i=0;i<n;i++){
	           int k = sc.nextInt();
	           if(k > 0) {
	        	   st.push(k);
	           }
	           else { 
	               if(!st.isEmpty()) { //정수가 0일 때 지우기
	                   st.pop();
	               }
	               else
	                   continue;
	           }
	           }

	       while(!st.isEmpty()){
	           sum += st.pop();
	       }
	       
	       System.out.println(sum);
	       sc.close();
	}

}
