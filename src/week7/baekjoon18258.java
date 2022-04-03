package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer; 

public class baekjoon18258 {
	 
	
	public static void main(String[]args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		 
		for(int i = 0 ; i< N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s =st.nextToken();
			
			switch(s) {
			
			case "push":{
				queue.offer(Integer.parseInt(st.nextToken()));
				break;
			}
			case "pop":{
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
				}
				else sb.append(queue.poll()).append('\n'); 
				break;
			}
			case "size":{
				sb.append(queue.size()).append('\n');
				break;
			}
			case "empty":{
				if(queue.isEmpty()) sb.append(1).append('\n');
				else sb.append(0).append('\n');
				break;
			}
			case "front":{
				if(queue.isEmpty()) sb.append(-1).append('\n');
				else sb.append(queue.peekFirst()).append('\n');
				break;
			}
			case "back":{
				if(queue.isEmpty())  sb.append(-1).append('\n');
				else sb.append(queue.peekLast()).append('\n'); 
				break;
			}
//			default: break;
			
			
			}
			
		}
		System.out.println(sb);
	}
	

}
