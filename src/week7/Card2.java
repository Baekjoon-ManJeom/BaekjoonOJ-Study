package week7;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Queue<Integer> que = new LinkedList<>();

        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) { //큐에 카드 쌓기
        	que.offer(i);
        }
        
        while(que.size() > 1) {
        	que.poll(); //한 장 버리기
        	que.offer(que.poll()); //맨 위 카드 아래로 깔기
        }
        
        if(!que.isEmpty()) {
        	System.out.println(que.peek());
        }
        in.close();

	}

}
