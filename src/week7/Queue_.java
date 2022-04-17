package week7;

import java.io.*;
import java.util.LinkedList;
import java.util.Deque;

public class Queue_ {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Deque<Integer> que = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                /* push: 정수 삽입 */
                case "push":
                	que.offer(Integer.parseInt(input[1]));
                    break;
                    
                /* pop: 가장 앞에 있는 정수를 빼고, 그 수를 출력. 정수가 없는 경우 -1 출력 */
                case "pop":
                	Integer item = que.poll(); //예외의 경우 null 반환
                    if (item == null) { 
                        bw.write("-1" + "\n"); 
                    } else {
                        bw.write(item + "\n");
                    }
                    break;
                    
                /* size: 정수 개수 출력 */
                case "size":
                    bw.write(que.size() + "\n");
                    break;
                    
                /* empty: 비어있으면 1, 아니면 0을 출력 */
                case "empty":
                    if (que.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                    
                /* front: 가장 앞에 있는 정수를 출력. 정수가 없는 경우에는 -1을 출력 */
                case "front":
                	Integer item2 = que.peek();
                    if (item2 == null) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(item2 + "\n");
                    }
                    break;
                    
                /* back: 가장 뒤에 있는 정수를 출력. 정수가 없는 경우에는 -1을 출력 */
                case "back":
                	Integer item3 = que.peekLast();
                    if (item3 == null) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(item3 + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();

	}

}
