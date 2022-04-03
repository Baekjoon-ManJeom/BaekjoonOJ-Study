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
                case "push":
                	que.offer(Integer.parseInt(input[1]));
                    break;
                case "pop":
                	Integer item = que.poll(); //예외의 경우 null 반환
                    if (item == null) { 
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(item + "\n");
                    }
                    break;
                case "size":
                    bw.write(que.size() + "\n");
                    break;
                case "empty":
                    if (que.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                	Integer item2 = que.peek();
                    if (item2 == null) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(item2 + "\n");
                    }
                    break;
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
