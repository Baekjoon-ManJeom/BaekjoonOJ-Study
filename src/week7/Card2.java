package week7;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Card2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Queue<Integer> que = new LinkedList<>();

        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) { //ť�� ī�� �ױ�
        	que.offer(i);
        }
        
        while(que.size() > 1) {
        	que.poll(); //�� �� ������
        	que.offer(que.poll()); //�� �� ī�� �Ʒ��� ���
        }
        
        if(!que.isEmpty()) {
        	System.out.println(que.peek());
        }
        in.close();

	}

}
