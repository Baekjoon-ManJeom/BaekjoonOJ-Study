package week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*<�˰��� ���� ���>
 * 1. ��ũ ���� 
 * 2. ������ �Լ� ���ڿ���, ���ȣ�� �Է¹��� �迭���� ���� �����Ͽ� ��ũ�� �Է� ��,
 * 3. �Լ� AC���� ������ ����
 * 4. �Լ� Print���� ������� ���
 * 
 * 
 * */

public class beakjoon5430 {

	static StringBuilder sb = new StringBuilder();
	static 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		Deque<Integer> q;
		StringTokenizer st ;

		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {

			String func = br.readLine();
			int n = Integer.parseInt(br.readLine());

			String array = br.readLine();

			st = new StringTokenizer(array, "[],"); // ���ȣ�� ��ǥ�� ���� ���� ����
			
			q = new ArrayDeque<Integer>();
			
			for(int j = 0; j<n;j++) {
				q.offer(Integer.parseInt(st.nextToken())); //��ũ�� ���� ����
			}
			
			AC(func,q); //������ �Լ� ���ڿ��� ��ũ�� �Ķ���ͷ� �ѱ�

		}
		
		System.out.println(sb);
		
	}
	public static void AC(String func, Deque<Integer> q) {
		
		boolean isRight = true;


		for(char cmd : func.toCharArray()) {
			
			// R�� ���
			if(cmd =='R') {				// R : boolean ������ ���� true�� 0��° �ε����� front, false�� ������ �ε����� front
				isRight = !isRight;
				continue;
			}

			// D�� ���
			if(isRight) {
				
				if(q.pollFirst() == null ) {	//�������̹Ƿ� 0��° �ε��� ����
					sb.append("error\n");
					return;
				}
				
			}
			else {
				if(q.pollLast() == null ) {		//�������̹Ƿ� ������ �ε��� ����
					sb.append("error\n");
					return;
				}
			}

		}



		Print(isRight, q);	// boolean���� ��ũ�� ��� �Լ��� �ѱ�
	}
	public static void Print (boolean isRight, Deque<Integer> q) {



		sb.append('[');
		
		if(q.size() > 0) {
			
		
		if(isRight) {	//������ �̹Ƿ� 0���� �ε������� ���ʴ�� ���
			sb.append(q.pollFirst());
			while(!q.isEmpty()) {
				sb.append(',').append(q.pollFirst());
			}
		}
		else {			//������ �̹Ƿ� ������ �ε������� ���ʴ�� ���
			sb.append(q.pollLast());
			while(!q.isEmpty()) {
				sb.append(',').append(q.pollLast());
			}
		}
		}
		sb.append(']').append('\n');

	}
}